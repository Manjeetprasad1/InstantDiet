package com.manny.instantdiet.viewModel

import androidx.lifecycle.MutableLiveData
import com.manny.instantdiet.ItemProvider
import com.manny.instantdiet.R
import com.manny.instantdiet.entity.CategoryEntity
import com.manny.instantdiet.entity.ProductEntity
import com.manny.instantdiet.itemViewModel.CategoryItemViewModel
import com.manny.instantdiet.itemViewModel.ProductItemViewModel

class DashboardViewModel : BaseViewModel(),CategoryItemViewModel.CategoryItemListener,ProductItemViewModel.ProductItemListener{
    val categoryEntityLiveData  = MutableLiveData<ArrayList<ItemProvider>>()
    val productEntityLiveData = MutableLiveData<ArrayList<ItemProvider>>()

    init {
        callApi()
        callProductApi()
    }

    private fun callProductApi() {
        val entity = ArrayList<ProductEntity>()
        entity.add(ProductEntity(true,"Swagger Veg shalad","Bestseller","Protein+Nitration+Carbon+Sugar+Vitamin+fat","https://static.onecms.io/wp-content/uploads/sites/44/2021/08/16/chopped-power-salad-with-chicken.jpg","50$",4.2))
        entity.add(ProductEntity(true,"Boiled Chicken","Bestseller","Protein+Nitration+Carbon+Sugar+Vitamin+fat","https://c.ndtvimg.com/2019-03/li1hno8g_chicken-for-weight-loss_625x300_08_March_19.jpg?im=FaceCrop,algorithm=dnn,width=1200,height=886","100$",4.2))
        entity.add(ProductEntity(true,"Protein Shake","Bestseller","Protein+Vitamin+Nut","https://fitfoodiefinds.com/wp-content/uploads/2020/01/sq.jpg","60$",4.2))
        entity.add(ProductEntity(true,"Swagger Veg shalad","Bestseller","Protein+Nitration+Carbon+Sugar+Vitamin+fat","https://static.onecms.io/wp-content/uploads/sites/44/2021/08/16/chopped-power-salad-with-chicken.jpg","50$",4.2))
        entity.add(ProductEntity(true,"Boiled Chicken","Bestseller","Protein+Nitration+Carbon+Sugar+Vitamin+fat","https://c.ndtvimg.com/2019-03/li1hno8g_chicken-for-weight-loss_625x300_08_March_19.jpg?im=FaceCrop,algorithm=dnn,width=1200,height=886","100$",4.2))
        entity.add(ProductEntity(true,"Protein Shake","Bestseller","Protein+Vitamin+Nut","https://fitfoodiefinds.com/wp-content/uploads/2020/01/sq.jpg","60$",4.2))
        entity.add(ProductEntity(true,"Swagger Veg shalad","Bestseller","Protein+Nitration+Carbon+Sugar+Vitamin+fat","https://static.onecms.io/wp-content/uploads/sites/44/2021/08/16/chopped-power-salad-with-chicken.jpg","50$",4.2))
        entity.add(ProductEntity(true,"Boiled Chicken","Bestseller","Protein+Nitration+Carbon+Sugar+Vitamin+fat","https://c.ndtvimg.com/2019-03/li1hno8g_chicken-for-weight-loss_625x300_08_March_19.jpg?im=FaceCrop,algorithm=dnn,width=1200,height=886","100$",4.2))
        entity.add(ProductEntity(true,"Protein Shake","Bestseller","Protein+Vitamin+Nut","https://fitfoodiefinds.com/wp-content/uploads/2020/01/sq.jpg","60$",4.2))

        val data = ArrayList<ItemProvider>()
        for (i in entity){
            data.add(ProductItemViewModel(i,this))
        }
        productEntityLiveData.value = data


    }

    private fun callApi() {
        val entity = ArrayList<CategoryEntity>()
        entity.add(CategoryEntity("All", R.drawable.location_icon,false))
        entity.add(CategoryEntity("Non veg", R.drawable.location_icon,false))
        entity.add(CategoryEntity("veg", R.drawable.location_icon,false))
        entity.add(CategoryEntity("Shack", R.drawable.location_icon,false))
        entity.add(CategoryEntity("Soup", R.drawable.location_icon,false))

        val data = ArrayList<ItemProvider>()
        for (i in entity){
            data.add(CategoryItemViewModel(i,this))
        }
        categoryEntityLiveData.value = data
    }

    override fun onClick(itemViewModel: CategoryItemViewModel) {

    }

    override fun onClick(itemViewModel: ProductItemViewModel) {

    }
}
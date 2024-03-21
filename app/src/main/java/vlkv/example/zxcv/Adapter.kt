package vlkv.example.zxcv

class Adapter {
    private val list = mutableListOf<String>()

    fun  addValue(value: String){
        list.add(value)
    }
}

class RecyclerViewHolder(private val binding: ItemLayoutBinding):{

}
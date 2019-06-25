# Generic view holder

# Usage

In your build.gradle(Project: android).
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

```

Add in your build.gradle(Module: app) 

```
dependencies {
 
  // Generic view holder
    implementation 'com.github.angelorobsonmelo:generic-viewholder:1.0.1'
}

```

Include the component in your layout


```Java

   class MainAdapter(private val items: List<Item>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

   // Instance a class Generic ViewHolder as a return
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GenericViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item, parent, false)
        )
    }

    override fun getItemCount() = items.size

   // Make a casting of the holder for Generic ViewHolder and a cast of binding for your databinding
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as GenericViewHolder).binding as ItemBinding
        binding.item = items[position]
    }
}

```



# Rapport

**Skriv din rapport här!**

Första som gjordes var att skriva baskod för att hämta url i json, efter det så lades till seed code
för jsontask, vilket innehåller task listener, url connection och en post execute listner.
Efter det så lades seed code till för PlantAdapter, Plants och PlantViewHolder. Efter ett tag med
problem att få appen att fungera så hittades att implements JsonTask.JsonTaskListener saknades i 
main activity, när det fixades så lades till en post execute i main för string json och en 
recyclerview i layout och som variable i main. Parsing data lades till i main efter detta
tillsammans med recyclerview adapter funktion. I Plant adater skrevs en array lista  och kod för
PlantViewHolder: public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType).
I PlantViewHolder så skrevs kod för att hämta super itemview som extendas till RecycleView 
viewholder. Efter detta så lades rätt url för att hämta plant data in, och en funktion för att hämta
all plant data och hur många element som hämtas. Här så lades seedcode till för aboutActivity och 
layout, men skapade fel, så datan blev inte automatiskt linkad i AndroidMainfest.xml så det var
tvunget att fixas. efter detta så skapades en clickhandler i main för att gå från main till about us
med hjälp av  Intent intent = new Intent(MainActivity.this, AboutActivity.class); 
startActivity(intent); och en click handler i aboutus som har click handler som stänger av activiten
så den återgår till main activity. och avslutade med lite styling


```
::Main activity::
 private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21ricni";
 ...
 ...
 aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View view) {
                Log.d("==>", "clicked about button");
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
 ...
 ...
        Type type = new TypeToken<List<Plants>>() {}.getType();
        List<Plants> listOfPlants = gson.fromJson(json, type);
        Log.d("==>","Plants amount: "+listOfPlants.size());
        Log.d("==>","Element 0 "+listOfPlants.get(0).toString());
        
 //Activity_main
 <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerview"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        tools:layout_editor_absoluteY="80dp"
        app:layout_constraintTop_toBottomOf="@+id/appBarLayout"
        />
        
 //PlantAdapter
 List<String> plants = Arrays.asList("Aloe Vera", "Dracaena","Succulents","Milk Tree Cactus","Snake plant" );
 ...
 ...
 public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plant, parent, false);
        return new PlantViewHolder(view);
    }.Ra
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.

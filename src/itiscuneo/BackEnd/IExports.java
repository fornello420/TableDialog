package itiscuneo.BackEnd;

import java.io.IOException;

public interface IExports {

    public static final String path= "data/";
    public static final String NAMECSV= "cespiti.csv";
    public static final String NAMEJSON= "cespiti.json";
    public void scriviCsv(ElencoCespiti elencoCespiti);
    public void scriviJson(ElencoCespiti elencoCespiti);
}

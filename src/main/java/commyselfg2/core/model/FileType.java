package commyselfg2.core.model;




import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum FileType {

    IMG("jpg","jpeg","png","bmp","gif"),
    DOC("doc","docx","pdf","ppt","pptx","xls","txt"),
    BIN("exe","jar","sh","msi"),
    ARCHIVE("zip","rar"),
    OTHER("*");

    private Set<String> extend = new HashSet<>();

    FileType(String...extend){
        this.extend.addAll(Arrays.asList(extend));
    }

    public static FileType lookupByExtend(String extend){
        for(FileType fileType:FileType.values()){
            if(fileType.extend.contains(extend)){
                return fileType;
            }
        }
        return FileType.OTHER;
    }

    public static FileType lookupByName(String name){
        for(FileType fileType:FileType.values()){
            if(fileType.name().equals(name)){
                return fileType;
            }
        }
        return FileType.OTHER;
    }
}

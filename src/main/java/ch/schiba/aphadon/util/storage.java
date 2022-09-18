package ch.schiba.aphadon.util;

import ch.schiba.aphadon.marketplace;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class storage {
    public File DataDirectory;

    storage(@NotNull File DataDir) throws Exception {
        if (!DataDir.exists()){
            if (!DataDir.mkdir()){
                marketplace.INSTANCE.log("Could not create Data Directory.", marketplace.ERROR);
            }
        }

        DataDirectory = DataDir;
    }
}

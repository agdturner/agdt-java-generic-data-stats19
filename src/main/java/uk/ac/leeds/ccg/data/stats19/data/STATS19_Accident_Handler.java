/*
 * Copyright 2018 geoagdt.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.data.stats19.data;

import java.nio.file.Path;
import java.nio.file.Paths;
import uk.ac.leeds.ccg.data.stats19.core.STATS19_Environment;
import uk.ac.leeds.ccg.data.stats19.core.STATS19_Strings;

/**
 * STATS19_Accident_Handler
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class STATS19_Accident_Handler extends STATS19_Handler {

    public STATS19_Accident_Handler(STATS19_Environment e, Path indir) {
        super(e);
        type = STATS19_Strings.s_accident;
        this.indir = indir;
    }

    protected Path getFile(Path dir, byte wave) {
        return Paths.get(dir.toString(), type + ".dat");
    }
}
MSc
===

This convert tool can convert most multiple source files programs to a single source file version. 

There are some features can not be achieved in this software. 

Firstly, this tool just simply remove all the package declarations in the multiple-files version. However, it is definitely  reasonable for a library author to maintain several packages with in a single file. My tool does not consider such a situation. As a consequence, for the package declarations, some other scientific operations are needed.

Secondly, it was said that the tool deletes all imports that don't start with ``import java.'' and ``import javax.''. Nonetheless, due to such an operation, the tool cannot work for the multiple files program which making use of a third party library. The tool will delete such kind of import decalrations and make the new single source file program cannot be compiled.

Thirdly, in the multiple source files program, one file may make use some variables from other files. My tool cannot detect and fix this kind of error during the conversion. However, this can be fixed by hand easily, programmer just needs to only keep the variables' name. 

If the three problems described above can be fixed, this convert tool will be more mature. For the current version, the tool are complete enough to convert most Java programs in daily life. If the newly generated single-file version software cannot be compiled, programmers just need to make some simple changes to let the new software becomes executable . 

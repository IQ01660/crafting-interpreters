# root src dir
SRC_DIR = src

# root binaries dir
BIN_DIR = bin

# class with the main method
MAIN_CLASS = com.craftinginterpreters.lox.Lox

# uses the root project folder as a name for the jar
JAR_NAME = $(notdir $(shell pwd)).jar

# all sources in the form:
# ./src/com/example/app/HelloWorld.java
SOURCES := $(shell find $(SRC_DIR) -name "*.java")

# list of paths into the .class objects in bin/
CLASSES := $(patsubst $(SRC_DIR)/%.java, $(BIN_DIR)/%.class, $(SOURCES))

# -cp specifies the classpath
# -d  specifies the target dir
# -sourcepath specifies where to look for .java files
JFLAGS = -cp . -d $(BIN_DIR) -sourcepath $(SRC_DIR)

# $(BIN_DIR) $(CLASSES)
compile: 
	javac $(JFLAGS) $(SOURCES)
	@echo "---Compilation Complete---"

run: $(CLASSES)
	java -cp $(BIN_DIR) $(MAIN_CLASS) $(ARGS)

clean:
	rm $(CLASSES)


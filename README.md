Scaladoc Test Project
===

How to run:
---

 - start sbt
 - type `doc`

Observe:
---

```
Cannot load the doclet class de.doclet.MyDoclet (specified with -doc-generator): java.lang.ClassNotFoundException: de.doclet.MyDoclet. Leaving the default settings will generate the html version of scaladoc.
```

Questions:
---

 - How do I setup the classpath right in `build.sbt`? (I tried absoulte path as well)
 - What would a demo Doclet look like, like printing the comment from the class `ExampleClass`? (How do I access the sourcefiles and tags?)

//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object ConditionTextSearchClassInfo: ClassInfo<Condition.TextSearch<*>> {

   override val kClass: KClass<Condition.TextSearch<*>> = Condition.TextSearch::class
   override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
   override val companion: Any? get() = null

   override val implements: List<Type<*>> = listOf(Type<com.lightningkite.mirror.archive.model.Condition<kotlin.CharSequence>>(com.lightningkite.mirror.archive.model.Condition::class, listOf(TypeProjection(Type<kotlin.CharSequence>(kotlin.CharSequence::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

   override val packageName: String = "com.lightningkite.mirror.archive.model"
   override val owner: KClass<*>? = Condition::class
   override val ownerName: String? = "Condition"

   override val name: String = "TextSearch"
   override val annotations: List<AnnotationInfo> = listOf()
   override val enumValues: List<Condition.TextSearch<*>>? = null

   val fieldQuery = FieldInfo<Condition.TextSearch<*>, kotlin.String>(this, "query", Type<kotlin.String>(kotlin.String::class, listOf(), false), false, { it.query as kotlin.String}, listOf())

   override val fields:List<FieldInfo<Condition.TextSearch<*>, *>> = listOf(fieldQuery)

   override fun construct(map: Map<String, Any?>): Condition.TextSearch<kotlin.CharSequence> {
       //Gather variables
       val query:kotlin.String = map["query"] as kotlin.String
           //Handle the optionals
       
       //Finally do the call
       return Condition.TextSearch<kotlin.CharSequence>(
           query = query
       )
   }

}
//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object ConditionClassInfo: ClassInfo<Condition<*>> {

   override val kClass: KClass<Condition<*>> = Condition::class
   override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Sealed)
   override val companion: Any? get() = null

   override val implements: List<Type<*>> = listOf(Type<kotlin.Any>(kotlin.Any::class, listOf(), false))

   override val packageName: String = "com.lightningkite.mirror.archive.model"
   override val owner: KClass<*>? = null
   override val ownerName: String? = null

   override val name: String = "Condition"
   override val annotations: List<AnnotationInfo> = listOf()
   override val enumValues: List<Condition<*>>? = null

   

   override val fields:List<FieldInfo<Condition<*>, *>> = listOf()

   override fun construct(map: Map<String, Any?>): Condition<Any?> = throw NotImplementedError()

}
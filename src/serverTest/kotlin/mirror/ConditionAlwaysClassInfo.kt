//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object ConditionAlwaysClassInfo: ClassInfo<Condition.Always<*>> {

   override val kClass: KClass<Condition.Always<*>> = Condition.Always::class
   override val modifiers: List<ClassInfo.Modifier> = listOf()
   override val companion: Any? get() = null

   override val implements: List<Type<*>> = listOf(Type<com.lightningkite.mirror.archive.model.Condition<Any?>>(com.lightningkite.mirror.archive.model.Condition::class, listOf(TypeProjection(Type<Any?>(Any::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

   override val packageName: String = "com.lightningkite.mirror.archive.model"
   override val owner: KClass<*>? = Condition::class
   override val ownerName: String? = "Condition"

   override val name: String = "Always"
   override val annotations: List<AnnotationInfo> = listOf()
   override val enumValues: List<Condition.Always<*>>? = null

   

   override val fields:List<FieldInfo<Condition.Always<*>, *>> = listOf()

   override fun construct(map: Map<String, Any?>): Condition.Always<Any?> {
       //Gather variables
       
           //Handle the optionals
       
       //Finally do the call
       return Condition.Always<Any?>(
           
       )
   }

}
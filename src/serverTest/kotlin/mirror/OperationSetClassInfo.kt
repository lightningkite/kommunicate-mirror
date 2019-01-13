//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object OperationSetClassInfo: ClassInfo<Operation.Set<*>> {

   override val kClass: KClass<Operation.Set<*>> = Operation.Set::class
   override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
   override val companion: Any? get() = null

   override val implements: List<Type<*>> = listOf(Type<com.lightningkite.mirror.archive.model.Operation<Any?>>(com.lightningkite.mirror.archive.model.Operation::class, listOf(TypeProjection(Type<Any?>(Any::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

   override val packageName: String = "com.lightningkite.mirror.archive.model"
   override val owner: KClass<*>? = Operation::class
   override val ownerName: String? = "Operation"

   override val name: String = "Set"
   override val annotations: List<AnnotationInfo> = listOf()
   override val enumValues: List<Operation.Set<*>>? = null

   val fieldValue = FieldInfo<Operation.Set<*>, Any?>(this, "value", Type<Any?>(Any::class, listOf(), false), false, { it.value as Any?}, listOf())

   override val fields:List<FieldInfo<Operation.Set<*>, *>> = listOf(fieldValue)

   override fun construct(map: Map<String, Any?>): Operation.Set<Any?> {
       //Gather variables
       val value:Any? = map["value"] as Any?
           //Handle the optionals
       
       //Finally do the call
       return Operation.Set<Any?>(
           value = value
       )
   }

}
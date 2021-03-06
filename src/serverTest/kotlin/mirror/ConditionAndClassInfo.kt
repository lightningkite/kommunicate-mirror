//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object ConditionAndClassInfo: ClassInfo<Condition.And<*>> {

    override val kClass: KClass<Condition.And<*>> = Condition.And::class
    override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
    override val companion: Any? get() = null

    override val implements: List<Type<*>> = listOf(Type<com.lightningkite.mirror.archive.model.Condition<Any?>>(com.lightningkite.mirror.archive.model.Condition::class, listOf(TypeProjection(Type<Any?>(Any::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

    override val packageName: String = "com.lightningkite.mirror.archive.model"
    override val owner: KClass<*>? = Condition::class
    override val ownerName: String? = "Condition"

    override val name: String = "And"
    override val annotations: List<AnnotationInfo> = listOf()
    override val enumValues: List<Condition.And<*>>? = null

    val fieldConditions = FieldInfo<Condition.And<*>, kotlin.collections.List<com.lightningkite.mirror.archive.model.Condition<Any?>>>(this, "conditions", Type<kotlin.collections.List<com.lightningkite.mirror.archive.model.Condition<Any?>>>(kotlin.collections.List::class, listOf(TypeProjection(Type<com.lightningkite.mirror.archive.model.Condition<Any?>>(com.lightningkite.mirror.archive.model.Condition::class, listOf(TypeProjection(Type<Any?>(Any::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false), TypeProjection.Variance.INVARIANT)), false), false, { it.conditions as kotlin.collections.List<com.lightningkite.mirror.archive.model.Condition<Any?>>}, listOf())

    override val fields:List<FieldInfo<Condition.And<*>, *>> = listOf(fieldConditions)

    override fun construct(map: Map<String, Any?>): Condition.And<Any?> {
        //Gather variables
        val conditions:kotlin.collections.List<com.lightningkite.mirror.archive.model.Condition<Any?>> = map["conditions"] as kotlin.collections.List<com.lightningkite.mirror.archive.model.Condition<Any?>>
        //Handle the optionals
        
        //Finally do the call
        return Condition.And<Any?>(
            conditions = conditions
        )
    }

}
//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object ReferenceClassInfo: ClassInfo<Reference<*,*>> {

    override val kClass: KClass<Reference<*,*>> = Reference::class
    override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
    override val companion: Any? get() = null

    override val implements: List<Type<*>> = listOf(Type<kotlin.Any>(kotlin.Any::class, listOf(), false))

    override val packageName: String = "com.lightningkite.mirror.archive.model"
    override val owner: KClass<*>? = null
    override val ownerName: String? = null

    override val name: String = "Reference"
    override val annotations: List<AnnotationInfo> = listOf()
    override val enumValues: List<Reference<*,*>>? = null

    val fieldKey = FieldInfo<Reference<*,*>, Any?>(this, "key", Type<Any?>(Any::class, listOf(), false), false, { it.key as Any?}, listOf())

    override val fields:List<FieldInfo<Reference<*,*>, *>> = listOf(fieldKey)

    override fun construct(map: Map<String, Any?>): Reference<Any?, Any?> {
        //Gather variables
        val key:Any? = map["key"] as Any?
        //Handle the optionals
        
        //Finally do the call
        return Reference<Any?, Any?>(
            key = key
        )
    }

}
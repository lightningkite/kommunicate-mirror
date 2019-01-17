//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.archive.model

import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object ConditionRegexTextSearchClassInfo: ClassInfo<Condition.RegexTextSearch<*>> {

    override val kClass: KClass<Condition.RegexTextSearch<*>> = Condition.RegexTextSearch::class
    override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
    override val companion: Any? get() = null

    override val implements: List<Type<*>> = listOf(Type<com.lightningkite.mirror.archive.model.Condition<kotlin.CharSequence>>(com.lightningkite.mirror.archive.model.Condition::class, listOf(TypeProjection(Type<kotlin.CharSequence>(kotlin.CharSequence::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

    override val packageName: String = "com.lightningkite.mirror.archive.model"
    override val owner: KClass<*>? = Condition::class
    override val ownerName: String? = "Condition"

    override val name: String = "RegexTextSearch"
    override val annotations: List<AnnotationInfo> = listOf()
    override val enumValues: List<Condition.RegexTextSearch<*>>? = null

    val fieldQuery = FieldInfo<Condition.RegexTextSearch<*>, kotlin.text.Regex>(this, "query", Type<kotlin.text.Regex>(kotlin.text.Regex::class, listOf(), false), false, { it.query as kotlin.text.Regex}, listOf())

    override val fields:List<FieldInfo<Condition.RegexTextSearch<*>, *>> = listOf(fieldQuery)

    override fun construct(map: Map<String, Any?>): Condition.RegexTextSearch<kotlin.CharSequence> {
        //Gather variables
        val query:kotlin.text.Regex = map["query"] as kotlin.text.Regex
        //Handle the optionals
        
        //Finally do the call
        return Condition.RegexTextSearch<kotlin.CharSequence>(
            query = query
        )
    }

}
//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.server

import com.lightningkite.kommon.exception.ExceptionNames
import com.lightningkite.lokalize.TimeStamp
import com.lightningkite.mirror.archive.server.security.HasPassword
import com.lightningkite.mirror.info.Indexed
import com.lightningkite.mirror.info.ThrowsTypes
import com.lightningkite.mirror.request.Request
import com.lightningkite.mirror.archive.database.*
import com.lightningkite.mirror.archive.model.*
import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object UserRemoveClassInfo: ClassInfo<User.Remove> {

   override val kClass: KClass<User.Remove> = User.Remove::class
   override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
   override val companion: Any? get() = null

   override val implements: List<Type<*>> = listOf(Type<SuspendMapRemoveRequest<Id, User>>(SuspendMapRemoveRequest::class, listOf(TypeProjection(Type<Id>(Id::class, listOf(), false), TypeProjection.Variance.INVARIANT), TypeProjection(Type<User>(User::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

   override val packageName: String = "com.lightningkite.mirror.server"
   override val owner: KClass<*>? = User::class
   override val ownerName: String? = "User"

   override val name: String = "Remove"
   override val annotations: List<AnnotationInfo> = listOf(AnnotationInfo("@ThrowsTypes", listOf(ExceptionNames.ForbiddenException)))
   override val enumValues: List<User.Remove>? = null

   val fieldKey = FieldInfo<User.Remove, Id>(this, "key", Type<Id>(Id::class, listOf(), false), false, { it.key as Id}, listOf())
    val fieldCondition = FieldInfo<User.Remove, Condition<User>>(this, "condition", Type<Condition<User>>(Condition::class, listOf(TypeProjection(Type<User>(User::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false), false, { it.condition as Condition<User>}, listOf())

   override val fields:List<FieldInfo<User.Remove, *>> = listOf(fieldKey, fieldCondition)

   override fun construct(map: Map<String, Any?>): User.Remove {
       //Gather variables
       val key:Id = map["key"] as Id
        val condition:Condition<User> = map["condition"] as Condition<User>
           //Handle the optionals
       
       //Finally do the call
       return User.Remove(
           key = key,
            condition = condition
       )
   }

}
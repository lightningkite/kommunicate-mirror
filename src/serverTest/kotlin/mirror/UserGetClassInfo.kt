//Generated by Lightning Kite's Mirror plugin
//AUTOMATICALLY GENERATED AND WILL BE OVERRIDDEN IF THIS MESSAGE IS PRESENT
package com.lightningkite.mirror.server

import com.lightningkite.kommon.exception.ExceptionNames
import com.lightningkite.lokalize.time.TimeStamp
import com.lightningkite.mirror.archive.server.security.HasPassword
import com.lightningkite.mirror.info.Indexed
import com.lightningkite.mirror.info.ThrowsTypes
import com.lightningkite.mirror.request.Request
import com.lightningkite.mirror.archive.database.*
import com.lightningkite.mirror.archive.model.*
import com.lightningkite.mirror.info.*
import kotlin.reflect.KClass

@Suppress("RemoveExplicitTypeArguments", "UNCHECKED_CAST", "USELESS_CAST")
object UserGetClassInfo: ClassInfo<User.Get> {

    override val kClass: KClass<User.Get> = User.Get::class
    override val modifiers: List<ClassInfo.Modifier> = listOf(ClassInfo.Modifier.Data)
    override val companion: Any? get() = null

    override val implements: List<Type<*>> = listOf(Type<SuspendMapGetRequest<Id, User>>(SuspendMapGetRequest::class, listOf(TypeProjection(Type<Id>(Id::class, listOf(), false), TypeProjection.Variance.INVARIANT), TypeProjection(Type<User>(User::class, listOf(), false), TypeProjection.Variance.INVARIANT)), false))

    override val packageName: String = "com.lightningkite.mirror.server"
    override val owner: KClass<*>? = User::class
    override val ownerName: String? = "User"

    override val name: String = "Get"
    override val annotations: List<AnnotationInfo> = listOf(AnnotationInfo("@ThrowsTypes", listOf(ExceptionNames.ForbiddenException)))
    override val enumValues: List<User.Get>? = null

    val fieldKey = FieldInfo<User.Get, Id>(this, "key", Type<Id>(Id::class, listOf(), false), false, { it.key as Id}, listOf())

    override val fields:List<FieldInfo<User.Get, *>> = listOf(fieldKey)

    override fun construct(map: Map<String, Any?>): User.Get {
        //Gather variables
        val key:Id = map["key"] as Id
        //Handle the optionals
        
        //Finally do the call
        return User.Get(
            key = key
        )
    }

}
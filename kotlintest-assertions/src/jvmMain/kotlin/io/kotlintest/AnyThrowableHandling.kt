@file:JvmName("AnyThrowableHandlingFunctions")

package io.kotlintest

import kotlin.reflect.KClass

@PublishedApi
internal actual val KClass<*>.platformQualifiedName: String
  get() = this.qualifiedName.toString()
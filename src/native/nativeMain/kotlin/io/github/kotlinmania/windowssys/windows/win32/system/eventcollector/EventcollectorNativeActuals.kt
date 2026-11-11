@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecClose
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecDeleteSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecOpenSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecRetrySubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecSaveSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ecClose(obj: Long): Bool =
    windowssys_windows_win32_system_eventcollector_ecClose(obj)

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    windowssys_windows_win32_system_eventcollector_ecDeleteSubscription(subscriptionname?.value?.toCPointer<ByteVar>(), flags)

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription(subscriptionenum, subscriptionnamebuffersize, subscriptionnamebuffer?.value?.toCPointer<ByteVar>(), subscriptionnamebufferused?.value?.toCPointer<ByteVar>())

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize(objectarray, objectarraysize?.value?.toCPointer<ByteVar>())

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty(subscription, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: COpaquePointer?, statusvaluebufferused: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus(subscriptionname?.value?.toCPointer<ByteVar>(), statusinfoid, eventsourcename?.value?.toCPointer<ByteVar>(), flags, statusvaluebuffersize, statusvaluebuffer?.value?.toCPointer<ByteVar>(), statusvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement(objectarray, arrayindex)

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    windowssys_windows_win32_system_eventcollector_ecOpenSubscription(subscriptionname?.value?.toCPointer<ByteVar>(), accessmask, flags)

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum(flags)

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement(objectarray, arrayindex)

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    windowssys_windows_win32_system_eventcollector_ecRetrySubscription(subscriptionname?.value?.toCPointer<ByteVar>(), eventsourcename?.value?.toCPointer<ByteVar>(), flags)

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    windowssys_windows_win32_system_eventcollector_ecSaveSubscription(subscription, flags)

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvalue?.value?.toCPointer<ByteVar>())

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty(subscription, propertyid, flags, propertyvalue?.value?.toCPointer<ByteVar>())

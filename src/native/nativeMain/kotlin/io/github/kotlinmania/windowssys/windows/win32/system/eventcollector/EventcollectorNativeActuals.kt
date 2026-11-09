@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun EcClose(obj: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcClose(obj)

public actual fun EcDeleteSubscription(subscriptionname: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcDeleteSubscription(subscriptionname.toCPointer<ByteVar>(), flags)

public actual fun EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: PWSTR, subscriptionnamebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription(subscriptionenum, subscriptionnamebuffersize, subscriptionnamebuffer.toCPointer<ByteVar>(), subscriptionnamebufferused.toCPointer<ByteVar>())

public actual fun EcGetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize(objectarray, objectarraysize.toCPointer<ByteVar>())

public actual fun EcGetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty(subscription, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EcGetSubscriptionRunTimeStatus(subscriptionname: PCWSTR, statusinfoid: EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename: PCWSTR, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: Long, statusvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus(subscriptionname.toCPointer<ByteVar>(), statusinfoid, eventsourcename.toCPointer<ByteVar>(), flags, statusvaluebuffersize, statusvaluebuffer.toCPointer<ByteVar>(), statusvaluebufferused.toCPointer<ByteVar>())

public actual fun EcInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement(objectarray, arrayindex)

public actual fun EcOpenSubscription(subscriptionname: PCWSTR, accessmask: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcOpenSubscription(subscriptionname.toCPointer<ByteVar>(), accessmask, flags)

public actual fun EcOpenSubscriptionEnum(flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum(flags)

public actual fun EcRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement(objectarray, arrayindex)

public actual fun EcRetrySubscription(subscriptionname: PCWSTR, eventsourcename: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcRetrySubscription(subscriptionname.toCPointer<ByteVar>(), eventsourcename.toCPointer<ByteVar>(), flags)

public actual fun EcSaveSubscription(subscription: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcSaveSubscription(subscription, flags)

public actual fun EcSetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvalue.toCPointer<ByteVar>())

public actual fun EcSetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty(subscription, propertyid, flags, propertyvalue.toCPointer<ByteVar>())

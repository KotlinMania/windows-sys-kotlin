@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32SystemEventcollectorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecClose(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecDeleteSubscription(subscriptionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: Int, subscriptionnamebuffer: Long, subscriptionnamebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize(objectarray: Long, objectarraysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty(subscription: Long, propertyid: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus(subscriptionname: Long, statusinfoid: Int, eventsourcename: Long, flags: Int, statusvaluebuffersize: Int, statusvaluebuffer: Long, statusvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement(objectarray: Long, arrayindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecOpenSubscription(subscriptionname: Long, accessmask: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum(flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement(objectarray: Long, arrayindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecRetrySubscription(subscriptionname: Long, eventsourcename: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecSaveSubscription(subscription: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty(subscription: Long, propertyid: Int, flags: Int, propertyvalue: Long): Int
}

public actual fun ecClose(obj: Long): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecClose(obj)

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecDeleteSubscription((subscriptionname?.value ?: 0L), flags.toInt())

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecEnumNextSubscription(subscriptionenum, subscriptionnamebuffersize.toInt(), (subscriptionnamebuffer?.value ?: 0L), (subscriptionnamebufferused?.value ?: 0L))

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecGetObjectArrayProperty(objectarray, propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecGetObjectArraySize(objectarray, (objectarraysize?.value ?: 0L))

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecGetSubscriptionProperty(subscription, propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: COpaquePointer?, statusvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecGetSubscriptionRunTimeStatus((subscriptionname?.value ?: 0L), statusinfoid, (eventsourcename?.value ?: 0L), flags.toInt(), statusvaluebuffersize.toInt(), (statusvaluebuffer?.value ?: 0L), (statusvaluebufferused?.value ?: 0L))

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecInsertObjectArrayElement(objectarray, arrayindex.toInt())

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecOpenSubscription((subscriptionname?.value ?: 0L), accessmask.toInt(), flags.toInt())

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecOpenSubscriptionEnum(flags.toInt())

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecRemoveObjectArrayElement(objectarray, arrayindex.toInt())

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecRetrySubscription((subscriptionname?.value ?: 0L), (eventsourcename?.value ?: 0L), flags.toInt())

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecSaveSubscription(subscription, flags.toInt())

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecSetObjectArrayProperty(objectarray, propertyid, arrayindex.toInt(), flags.toInt(), (propertyvalue?.value ?: 0L))

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_ecSetSubscriptionProperty(subscription, propertyid, flags.toInt(), (propertyvalue?.value ?: 0L))

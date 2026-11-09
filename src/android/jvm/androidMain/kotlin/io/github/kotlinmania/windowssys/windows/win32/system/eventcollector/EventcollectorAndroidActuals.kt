@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32SystemEventcollectorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcClose(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcDeleteSubscription(subscriptionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: Int, subscriptionnamebuffer: Long, subscriptionnamebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty(subscription: Long, propertyid: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus(subscriptionname: Long, statusinfoid: Int, eventsourcename: Long, flags: Int, statusvaluebuffersize: Int, statusvaluebuffer: Long, statusvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement(objectarray: Long, arrayindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcOpenSubscription(subscriptionname: Long, accessmask: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum(flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement(objectarray: Long, arrayindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcRetrySubscription(subscriptionname: Long, eventsourcename: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcSaveSubscription(subscription: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty(subscription: Long, propertyid: Int, flags: Int, propertyvalue: Long): Int
}

public actual fun EcClose(obj: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcClose(obj)

public actual fun EcDeleteSubscription(subscriptionname: PCWSTR, flags: UInt): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcDeleteSubscription(subscriptionname, flags.toInt())

public actual fun EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: PWSTR, subscriptionnamebufferused: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription(subscriptionenum, subscriptionnamebuffersize.toInt(), subscriptionnamebuffer, subscriptionnamebufferused)

public actual fun EcGetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty(objectarray, propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize(objectarray, objectarraysize)

public actual fun EcGetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty(subscription, propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EcGetSubscriptionRunTimeStatus(subscriptionname: PCWSTR, statusinfoid: EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename: PCWSTR, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: Long, statusvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus(subscriptionname, statusinfoid, eventsourcename, flags.toInt(), statusvaluebuffersize.toInt(), statusvaluebuffer, statusvaluebufferused)

public actual fun EcInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement(objectarray, arrayindex.toInt())

public actual fun EcOpenSubscription(subscriptionname: PCWSTR, accessmask: UInt, flags: UInt): Long =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcOpenSubscription(subscriptionname, accessmask.toInt(), flags.toInt())

public actual fun EcOpenSubscriptionEnum(flags: UInt): Long =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum(flags.toInt())

public actual fun EcRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement(objectarray, arrayindex.toInt())

public actual fun EcRetrySubscription(subscriptionname: PCWSTR, eventsourcename: PCWSTR, flags: UInt): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcRetrySubscription(subscriptionname, eventsourcename, flags.toInt())

public actual fun EcSaveSubscription(subscription: Long, flags: UInt): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcSaveSubscription(subscription, flags.toInt())

public actual fun EcSetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvalue: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty(objectarray, propertyid, arrayindex.toInt(), flags.toInt(), propertyvalue)

public actual fun EcSetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    WindowsWin32SystemEventcollectorJniBridge.windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty(subscription, propertyid, flags.toInt(), propertyvalue)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun EcClose(obj: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcClose", longArrayOf(obj)).toInt()
}

public fun EcDeleteSubscription(subscriptionname: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcDeleteSubscription", longArrayOf(subscriptionname, flags.toLong())).toInt()
}

public fun EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: PWSTR, subscriptionnamebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcEnumNextSubscription", longArrayOf(subscriptionenum, subscriptionnamebuffersize.toLong(), subscriptionnamebuffer, subscriptionnamebufferused)).toInt()
}

public fun EcGetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcGetObjectArrayProperty", longArrayOf(objectarray, propertyid.toLong(), arrayindex.toLong(), flags.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcGetObjectArraySize", longArrayOf(objectarray, objectarraysize)).toInt()
}

public fun EcGetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcGetSubscriptionProperty", longArrayOf(subscription, propertyid.toLong(), flags.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EcGetSubscriptionRunTimeStatus(subscriptionname: PCWSTR, statusinfoid: EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename: PCWSTR, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: Long, statusvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcGetSubscriptionRunTimeStatus", longArrayOf(subscriptionname, statusinfoid.toLong(), eventsourcename, flags.toLong(), statusvaluebuffersize.toLong(), statusvaluebuffer, statusvaluebufferused)).toInt()
}

public fun EcInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcInsertObjectArrayElement", longArrayOf(objectarray, arrayindex.toLong())).toInt()
}

public fun EcOpenSubscription(subscriptionname: PCWSTR, accessmask: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcOpenSubscription", longArrayOf(subscriptionname, accessmask.toLong(), flags.toLong()))
}

public fun EcOpenSubscriptionEnum(flags: UInt): Long {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcOpenSubscriptionEnum", longArrayOf(flags.toLong()))
}

public fun EcRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcRemoveObjectArrayElement", longArrayOf(objectarray, arrayindex.toLong())).toInt()
}

public fun EcRetrySubscription(subscriptionname: PCWSTR, eventsourcename: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcRetrySubscription", longArrayOf(subscriptionname, eventsourcename, flags.toLong())).toInt()
}

public fun EcSaveSubscription(subscription: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcSaveSubscription", longArrayOf(subscription, flags.toLong())).toInt()
}

public fun EcSetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcSetObjectArrayProperty", longArrayOf(objectarray, propertyid.toLong(), arrayindex.toLong(), flags.toLong(), propertyvalue)).toInt()
}

public fun EcSetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("wecapi.dll", "EcSetSubscriptionProperty", longArrayOf(subscription, propertyid.toLong(), flags.toLong(), propertyvalue)).toInt()
}

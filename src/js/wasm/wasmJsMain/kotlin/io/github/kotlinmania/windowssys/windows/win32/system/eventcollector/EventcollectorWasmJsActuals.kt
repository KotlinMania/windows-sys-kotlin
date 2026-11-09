@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public actual fun EcClose(obj: Long): BOOL =
    0

public actual fun EcDeleteSubscription(subscriptionname: PCWSTR, flags: UInt): BOOL =
    0

public actual fun EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: PWSTR, subscriptionnamebufferused: Long): BOOL =
    0

public actual fun EcGetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    0

public actual fun EcGetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EcGetSubscriptionRunTimeStatus(subscriptionname: PCWSTR, statusinfoid: EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename: PCWSTR, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: Long, statusvaluebufferused: Long): BOOL =
    0

public actual fun EcInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    0

public actual fun EcOpenSubscription(subscriptionname: PCWSTR, accessmask: UInt, flags: UInt): Long =
    0L

public actual fun EcOpenSubscriptionEnum(flags: UInt): Long =
    0L

public actual fun EcRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    0

public actual fun EcRetrySubscription(subscriptionname: PCWSTR, eventsourcename: PCWSTR, flags: UInt): BOOL =
    0

public actual fun EcSaveSubscription(subscription: Long, flags: UInt): BOOL =
    0

public actual fun EcSetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvalue: Long): BOOL =
    0

public actual fun EcSetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    0

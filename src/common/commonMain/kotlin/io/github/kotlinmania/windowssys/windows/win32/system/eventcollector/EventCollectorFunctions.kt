package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun EcClose(obj: Long): BOOL

public expect fun EcDeleteSubscription(subscriptionname: PCWSTR, flags: UInt): BOOL

public expect fun EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: PWSTR, subscriptionnamebufferused: Long): BOOL

public expect fun EcGetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL

public expect fun EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL

public expect fun EcGetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL

public expect fun EcGetSubscriptionRunTimeStatus(subscriptionname: PCWSTR, statusinfoid: EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename: PCWSTR, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: Long, statusvaluebufferused: Long): BOOL

public expect fun EcInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL

public expect fun EcOpenSubscription(subscriptionname: PCWSTR, accessmask: UInt, flags: UInt): Long

public expect fun EcOpenSubscriptionEnum(flags: UInt): Long

public expect fun EcRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL

public expect fun EcRetrySubscription(subscriptionname: PCWSTR, eventsourcename: PCWSTR, flags: UInt): BOOL

public expect fun EcSaveSubscription(subscription: Long, flags: UInt): BOOL

public expect fun EcSetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvalue: Long): BOOL

public expect fun EcSetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL

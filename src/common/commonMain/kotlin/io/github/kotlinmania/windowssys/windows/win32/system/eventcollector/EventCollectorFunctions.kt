package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun ecClose(obj: Long): Bool

public expect fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool

public expect fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: COpaquePointer?): Bool

public expect fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun ecGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool

public expect fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: COpaquePointer?, statusvaluebufferused: COpaquePointer?): Bool

public expect fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool

public expect fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long

public expect fun ecOpenSubscriptionEnum(flags: UInt): Long

public expect fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool

public expect fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool

public expect fun ecSaveSubscription(subscription: Long, flags: UInt): Bool

public expect fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: COpaquePointer?): Bool

public expect fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool

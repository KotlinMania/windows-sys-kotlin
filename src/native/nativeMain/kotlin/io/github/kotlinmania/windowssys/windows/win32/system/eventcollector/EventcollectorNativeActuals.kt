@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcClose
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcOpenSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcRetrySubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcSaveSubscription
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventcollector.cinterop.windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ecClose(obj: Long): Bool =
    windowssysWindowsWin32SystemEventcollectorEcClose(obj)

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription(subscriptionname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription(subscriptionenum, subscriptionnamebuffersize, subscriptionnamebuffer.rawAddress.toCPointer<ByteVar>(), subscriptionnamebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EcVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize(objectarray, objectarraysize.rawAddress.toCPointer<ByteVar>())

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EcVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty(subscription, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: MutPtr<EcVariant>, statusvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus(subscriptionname.rawAddress.toCPointer<ByteVar>(), statusinfoid, eventsourcename.rawAddress.toCPointer<ByteVar>(), flags, statusvaluebuffersize, statusvaluebuffer.rawAddress.toCPointer<ByteVar>(), statusvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray, arrayindex)

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    windowssysWindowsWin32SystemEventcollectorEcOpenSubscription(subscriptionname.rawAddress.toCPointer<ByteVar>(), accessmask, flags)

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags)

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray, arrayindex)

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventcollectorEcRetrySubscription(subscriptionname.rawAddress.toCPointer<ByteVar>(), eventsourcename.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription, flags)

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: MutPtr<EcVariant>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvalue.rawAddress.toCPointer<ByteVar>())

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: MutPtr<EcVariant>): Bool =
    windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty(subscription, propertyid, flags, propertyvalue.rawAddress.toCPointer<ByteVar>())

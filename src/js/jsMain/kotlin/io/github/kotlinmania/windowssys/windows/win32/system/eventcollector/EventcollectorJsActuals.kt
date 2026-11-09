@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32SystemEventcollectorNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun EcClose(obj: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcClose(obj.toString()) as Int) else 0

public actual fun EcDeleteSubscription(subscriptionname: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcDeleteSubscription(subscriptionname.toString(), flags.toInt()) as Int) else 0

public actual fun EcEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: PWSTR, subscriptionnamebufferused: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcEnumNextSubscription(subscriptionenum.toString(), subscriptionnamebuffersize.toInt(), subscriptionnamebuffer.toString(), subscriptionnamebufferused.toString()) as Int) else 0

public actual fun EcGetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcGetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EcGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcGetObjectArraySize(objectarray.toString(), objectarraysize.toString()) as Int) else 0

public actual fun EcGetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcGetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EcGetSubscriptionRunTimeStatus(subscriptionname: PCWSTR, statusinfoid: EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename: PCWSTR, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: Long, statusvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcGetSubscriptionRunTimeStatus(subscriptionname.toString(), statusinfoid, eventsourcename.toString(), flags.toInt(), statusvaluebuffersize.toInt(), statusvaluebuffer.toString(), statusvaluebufferused.toString()) as Int) else 0

public actual fun EcInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcInsertObjectArrayElement(objectarray.toString(), arrayindex.toInt()) as Int) else 0

public actual fun EcOpenSubscription(subscriptionname: PCWSTR, accessmask: UInt, flags: UInt): Long =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcOpenSubscription(subscriptionname.toString(), accessmask.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun EcOpenSubscriptionEnum(flags: UInt): Long =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcOpenSubscriptionEnum(flags.toInt()) as String).toLong() else 0L

public actual fun EcRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcRemoveObjectArrayElement(objectarray.toString(), arrayindex.toInt()) as Int) else 0

public actual fun EcRetrySubscription(subscriptionname: PCWSTR, eventsourcename: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcRetrySubscription(subscriptionname.toString(), eventsourcename.toString(), flags.toInt()) as Int) else 0

public actual fun EcSaveSubscription(subscription: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcSaveSubscription(subscription.toString(), flags.toInt()) as Int) else 0

public actual fun EcSetObjectArrayProperty(objectarray: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, arrayindex: UInt, flags: UInt, propertyvalue: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcSetObjectArrayProperty(objectarray.toString(), propertyid, arrayindex.toInt(), flags.toInt(), propertyvalue.toString()) as Int) else 0

public actual fun EcSetSubscriptionProperty(subscription: Long, propertyid: EC_SUBSCRIPTION_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    if (_windowsWin32SystemEventcollectorNapiAddon != null) (_windowsWin32SystemEventcollectorNapiAddon.windowssys_windows_win32_system_eventcollector_EcSetSubscriptionProperty(subscription.toString(), propertyid, flags.toInt(), propertyvalue.toString()) as Int) else 0

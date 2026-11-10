@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesBiometricframeworkNapiAddon(): Boolean

private val _windowsWin32DevicesBiometricframeworkNapiAvailable: Boolean = _initWindowsWin32DevicesBiometricframeworkNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus()")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: String, p11: Int, p12: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioCancel(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioCancel(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioCaptureSample(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioCaptureSample(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioCloseFramework(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioCloseFramework(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioCloseSession(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioCloseSession(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioControlUnit(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioControlUnit(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioFree(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioGetProperty(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetProperty(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioIdentify(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioIdentify(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioImproveBegin(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioImproveBegin(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioImproveEnd(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioImproveEnd(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioLocateSensor(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioLocateSensor(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioLockUnit(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioLockUnit(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioOpenSession(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioOpenSession(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus()")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials()")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials()")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioSetCredential(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioSetCredential(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioSetProperty(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioSetProperty(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioVerify(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioVerify(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_biometricframework_winBioWait(p0)")
private external fun _wasm_windowssys_windows_win32_devices_biometricframework_winBioWait(p0: Int): Int

public actual fun winBioAcquireFocus(): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, frameworkhandle: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework(notificationmethod, (targetwindow?.value ?: 0L).toString(), messagecode.toInt(), 0L.toString(), (userdata?.value ?: 0L).toString(), asynchronousopen, (frameworkhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, sessionhandle: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), (unitarray?.value ?: 0L).toString(), unitcount.toString(), (databaseid?.value ?: 0L).toString(), notificationmethod, (targetwindow?.value ?: 0L).toString(), messagecode.toInt(), 0L.toString(), (userdata?.value ?: 0L).toString(), asynchronousopen, (sessionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioCancel(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: COpaquePointer?, sample: COpaquePointer?, samplesize: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioCaptureSample(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), (unitid?.value ?: 0L).toString(), (sample?.value ?: 0L).toString(), (samplesize?.value ?: 0L).toString(), (rejectdetail?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), 0L.toString(), (capturecallbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioCloseFramework(frameworkhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioCloseSession(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), (sendbuffer?.value ?: 0L).toString(), sendbuffersize.toString(), (receivebuffer?.value ?: 0L).toString(), receivebuffersize.toString(), (receivedatasize?.value ?: 0L).toString(), (operationstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), (sendbuffer?.value ?: 0L).toString(), sendbuffersize.toString(), (receivebuffer?.value ?: 0L).toString(), receivebuffersize.toString(), (receivedatasize?.value ?: 0L).toString(), (operationstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), (identity?.value ?: 0L).toString(), subfactor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin(sessionhandle.toInt(), subfactor.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture(sessionhandle.toInt(), (rejectdetail?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback(sessionhandle.toInt(), 0L.toString(), (enrollcallbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: COpaquePointer?, isnewtemplate: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit(sessionhandle.toInt(), (identity?.value ?: 0L).toString(), (isnewtemplate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: COpaquePointer?, unitcount: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits(factor.toInt(), (unitschemaarray?.value ?: 0L).toString(), (unitcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: COpaquePointer?, storagecount: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases(factor.toInt(), (storageschemaarray?.value ?: 0L).toString(), (storagecount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactorarray: COpaquePointer?, subfactorcount: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), (identity?.value ?: 0L).toString(), (subfactorarray?.value ?: 0L).toString(), (subfactorcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: COpaquePointer?, bspcount: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders(factor.toInt(), (bspschemaarray?.value ?: 0L).toString(), (bspcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioFree(address: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioFree((address?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetDomainLogonSetting(value: COpaquePointer?, source: COpaquePointer?) {
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting((value?.value ?: 0L).toString(), (source?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetEnabledSetting(value: COpaquePointer?, source: COpaquePointer?) {
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting((value?.value ?: 0L).toString(), (source?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetEnrolledFactors(accountowner: COpaquePointer?, enrolledfactors: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors((accountowner?.value ?: 0L).toString(), (enrolledfactors?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetLogonSetting(value: COpaquePointer?, source: COpaquePointer?) {
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting((value?.value ?: 0L).toString(), (source?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), (identity?.value ?: 0L).toString(), subfactor.toInt(), (propertybuffer?.value ?: 0L).toString(), (propertybuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioIdentify(sessionhandle: UInt, unitid: COpaquePointer?, identity: COpaquePointer?, subfactor: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioIdentify(sessionhandle.toInt(), (unitid?.value ?: 0L).toString(), (identity?.value ?: 0L).toString(), (subfactor?.value ?: 0L).toString(), (rejectdetail?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback(sessionhandle.toInt(), 0L.toString(), (identifycallbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioImproveBegin(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioImproveEnd(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioLocateSensor(sessionhandle.toInt(), (unitid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback(sessionhandle.toInt(), 0L.toString(), (locatecallbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioLockUnit(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, sessionhandle: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), (unitarray?.value ?: 0L).toString(), unitcount.toString(), (databaseid?.value ?: 0L).toString(), (sessionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), 0L.toString(), (eventcallbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioReleaseFocus(): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveAllCredentials(): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: COpaquePointer?, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioSetCredential(type, (credential?.value ?: 0L).toString(), credentialsize.toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: ULong): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), (identity?.value ?: 0L).toString(), subfactor.toInt(), (propertybuffer?.value ?: 0L).toString(), propertybuffersize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioVerify(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, unitid: COpaquePointer?, match: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioVerify(sessionhandle.toInt(), (identity?.value ?: 0L).toString(), subfactor.toInt(), (unitid?.value ?: 0L).toString(), (match?.value ?: 0L).toString(), (rejectdetail?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback(sessionhandle.toInt(), (identity?.value ?: 0L).toString(), subfactor.toInt(), 0L.toString(), (verifycallbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    if (_windowsWin32DevicesBiometricframeworkNapiAvailable) _wasm_windowssys_windows_win32_devices_biometricframework_winBioWait(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

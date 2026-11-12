@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesBiometricframeworkNapiAddon(): Boolean

private val windowsWin32DevicesBiometricframeworkNapiAvailable: Boolean = initWindowsWin32DevicesBiometricframeworkNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus()")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String, p10: String, p11: Int, p12: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioFree(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus()")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials()")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials()")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBiometricframeworkWinBioWait(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioWait(p0: Int): Int

public actual fun winBioAcquireFocus(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, frameworkhandle: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(notificationmethod, targetwindow.rawAddress.toString(), messagecode.toInt(), 0L.toString(), userdata.rawAddress.toString(), asynchronousopen, frameworkhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, sessionhandle: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.rawAddress.toString(), unitcount.toString(), databaseid.rawAddress.toString(), notificationmethod, targetwindow.rawAddress.toString(), messagecode.toInt(), 0L.toString(), userdata.rawAddress.toString(), asynchronousopen, sessionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr, sample: MutPtr, samplesize: MutPtr, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), unitid.rawAddress.toString(), sample.rawAddress.toString(), samplesize.rawAddress.toString(), rejectdetail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), 0L.toString(), capturecallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.rawAddress.toString(), sendbuffersize.toString(), receivebuffer.rawAddress.toString(), receivebuffersize.toString(), receivedatasize.rawAddress.toString(), operationstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.rawAddress.toString(), sendbuffersize.toString(), receivebuffer.rawAddress.toString(), receivebuffersize.toString(), receivedatasize.rawAddress.toString(), operationstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle.toInt(), subfactor.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(sessionhandle.toInt(), rejectdetail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(sessionhandle.toInt(), 0L.toString(), enrollcallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr, isnewtemplate: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(sessionhandle.toInt(), identity.rawAddress.toString(), isnewtemplate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr, unitcount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(factor.toInt(), unitschemaarray.rawAddress.toString(), unitcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr, storagecount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(factor.toInt(), storageschemaarray.rawAddress.toString(), storagecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactorarray: MutPtr, subfactorcount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactorarray.rawAddress.toString(), subfactorcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr, bspcount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(factor.toInt(), bspschemaarray.rawAddress.toString(), bspcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioFree(address: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioFree(address.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetDomainLogonSetting(value: MutPtr, source: MutPtr) {
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(value.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetEnabledSetting(value: MutPtr, source: MutPtr) {
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(value.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetEnrolledFactors(accountowner: ConstPtr, enrolledfactors: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(accountowner.rawAddress.toString(), enrolledfactors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetLogonSetting(value: MutPtr, source: MutPtr) {
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(value.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: MutPtr, propertybuffersize: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactor.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr, identity: MutPtr, subfactor: MutPtr, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(sessionhandle.toInt(), unitid.rawAddress.toString(), identity.rawAddress.toString(), subfactor.rawAddress.toString(), rejectdetail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(sessionhandle.toInt(), 0L.toString(), identifycallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(sessionhandle.toInt(), unitid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(sessionhandle.toInt(), 0L.toString(), locatecallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, sessionhandle: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.rawAddress.toString(), unitcount.toString(), databaseid.rawAddress.toString(), sessionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), 0L.toString(), eventcallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioReleaseFocus(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveAllCredentials(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(type, credential.rawAddress.toString(), credentialsize.toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: ConstPtr, propertybuffersize: ULong): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactor.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle.toInt(), unitid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioVerify(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, unitid: MutPtr, match: MutPtr, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(sessionhandle.toInt(), identity.rawAddress.toString(), subfactor.toInt(), unitid.rawAddress.toString(), match.rawAddress.toString(), rejectdetail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(sessionhandle.toInt(), identity.rawAddress.toString(), subfactor.toInt(), 0L.toString(), verifycallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAvailable) wasmWindowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

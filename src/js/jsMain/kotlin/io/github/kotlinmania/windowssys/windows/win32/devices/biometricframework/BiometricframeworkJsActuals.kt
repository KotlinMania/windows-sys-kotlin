@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32DevicesBiometricframeworkNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun winBioAcquireFocus(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, frameworkhandle: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(notificationmethod, targetwindow.rawAddress.toString(), messagecode.toInt(), 0L.toString(), userdata.rawAddress.toString(), asynchronousopen, frameworkhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, sessionhandle: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.rawAddress.toString(), unitcount.toString(), databaseid.rawAddress.toString(), notificationmethod, targetwindow.rawAddress.toString(), messagecode.toInt(), 0L.toString(), userdata.rawAddress.toString(), asynchronousopen, sessionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr, sample: MutPtr, samplesize: MutPtr, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), unitid.rawAddress.toString(), sample.rawAddress.toString(), samplesize.rawAddress.toString(), rejectdetail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), 0L.toString(), capturecallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.rawAddress.toString(), sendbuffersize.toString(), receivebuffer.rawAddress.toString(), receivebuffersize.toString(), receivedatasize.rawAddress.toString(), operationstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.rawAddress.toString(), sendbuffersize.toString(), receivebuffer.rawAddress.toString(), receivebuffersize.toString(), receivedatasize.rawAddress.toString(), operationstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle.toInt(), subfactor.toInt(), unitid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(sessionhandle.toInt(), rejectdetail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(sessionhandle.toInt(), 0L.toString(), enrollcallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr, isnewtemplate: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(sessionhandle.toInt(), identity.rawAddress.toString(), isnewtemplate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr, unitcount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(factor.toInt(), unitschemaarray.rawAddress.toString(), unitcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr, storagecount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(factor.toInt(), storageschemaarray.rawAddress.toString(), storagecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactorarray: MutPtr, subfactorcount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactorarray.rawAddress.toString(), subfactorcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr, bspcount: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(factor.toInt(), bspschemaarray.rawAddress.toString(), bspcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioFree(address: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioFree(address.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetDomainLogonSetting(value: MutPtr, source: MutPtr) {
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) {
        windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(value.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetEnabledSetting(value: MutPtr, source: MutPtr) {
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) {
        windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(value.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetEnrolledFactors(accountowner: ConstPtr, enrolledfactors: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(accountowner.rawAddress.toString(), enrolledfactors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioGetLogonSetting(value: MutPtr, source: MutPtr) {
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) {
        windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(value.rawAddress.toString(), source.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: MutPtr, propertybuffersize: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactor.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr, identity: MutPtr, subfactor: MutPtr, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(sessionhandle.toInt(), unitid.rawAddress.toString(), identity.rawAddress.toString(), subfactor.rawAddress.toString(), rejectdetail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(sessionhandle.toInt(), 0L.toString(), identifycallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle.toInt(), unitid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(sessionhandle.toInt(), unitid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(sessionhandle.toInt(), 0L.toString(), locatecallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle.toInt(), unitid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle.toInt(), unitid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, sessionhandle: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.rawAddress.toString(), unitcount.toString(), databaseid.rawAddress.toString(), sessionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), 0L.toString(), eventcallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioReleaseFocus(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveAllCredentials(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(type, credential.rawAddress.toString(), credentialsize.toString(), format) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: ConstPtr, propertybuffersize: ULong): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.rawAddress.toString(), subfactor.toInt(), propertybuffer.rawAddress.toString(), propertybuffersize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle.toInt(), unitid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioVerify(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, unitid: MutPtr, match: MutPtr, rejectdetail: MutPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(sessionhandle.toInt(), identity.rawAddress.toString(), subfactor.toInt(), unitid.rawAddress.toString(), match.rawAddress.toString(), rejectdetail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(sessionhandle.toInt(), identity.rawAddress.toString(), subfactor.toInt(), 0L.toString(), verifycallbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    if (windowsWin32DevicesBiometricframeworkNapiAddon != null) (windowsWin32DevicesBiometricframeworkNapiAddon.windowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

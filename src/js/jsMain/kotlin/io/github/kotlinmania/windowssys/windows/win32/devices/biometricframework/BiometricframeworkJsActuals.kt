@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32DevicesBiometricframeworkNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun WinBioAcquireFocus(): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus() as Int) else 0

public actual fun WinBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt()) as Int) else 0

public actual fun WinBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt()) as Int) else 0

public actual fun WinBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt()) as Int) else 0

public actual fun WinBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt()) as Int) else 0

public actual fun WinBioAsyncOpenFramework(notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, frameworkhandle: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework(notificationmethod, targetwindow.toString(), messagecode.toInt(), callbackroutine.toLong().toString(), userdata.toString(), asynchronousopen, frameworkhandle.toString()) as Int) else 0

public actual fun WinBioAsyncOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, sessionhandle: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.toString(), unitcount.toString(), databaseid.toString(), notificationmethod, targetwindow.toString(), messagecode.toInt(), callbackroutine.toLong().toString(), userdata.toString(), asynchronousopen, sessionhandle.toString()) as Int) else 0

public actual fun WinBioCancel(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioCancel(sessionhandle.toInt()) as Int) else 0

public actual fun WinBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), unitid.toString(), sample.toString(), samplesize.toString(), rejectdetail.toString()) as Int) else 0

public actual fun WinBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PWINBIO_CAPTURE_CALLBACK, capturecallbackcontext: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toInt(), flags.toInt(), capturecallback.toLong().toString(), capturecallbackcontext.toString()) as Int) else 0

public actual fun WinBioCloseFramework(frameworkhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework(frameworkhandle.toInt()) as Int) else 0

public actual fun WinBioCloseSession(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioCloseSession(sessionhandle.toInt()) as Int) else 0

public actual fun WinBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.toString(), sendbuffersize.toString(), receivebuffer.toString(), receivebuffersize.toString(), receivedatasize.toString(), operationstatus.toString()) as Int) else 0

public actual fun WinBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.toString(), sendbuffersize.toString(), receivebuffer.toString(), receivebuffersize.toString(), receivedatasize.toString(), operationstatus.toString()) as Int) else 0

public actual fun WinBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: Long, subfactor: UByte): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), identity.toString(), subfactor.toInt()) as Int) else 0

public actual fun WinBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin(sessionhandle.toInt(), subfactor.toInt(), unitid.toInt()) as Int) else 0

public actual fun WinBioEnrollCapture(sessionhandle: UInt, rejectdetail: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture(sessionhandle.toInt(), rejectdetail.toString()) as Int) else 0

public actual fun WinBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PWINBIO_ENROLL_CAPTURE_CALLBACK, enrollcallbackcontext: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback(sessionhandle.toInt(), enrollcallback.toLong().toString(), enrollcallbackcontext.toString()) as Int) else 0

public actual fun WinBioEnrollCommit(sessionhandle: UInt, identity: Long, isnewtemplate: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit(sessionhandle.toInt(), identity.toString(), isnewtemplate.toString()) as Int) else 0

public actual fun WinBioEnrollDiscard(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard(sessionhandle.toInt()) as Int) else 0

public actual fun WinBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toString()) as Int) else 0

public actual fun WinBioEnumBiometricUnits(factor: UInt, unitschemaarray: Long, unitcount: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits(factor.toInt(), unitschemaarray.toString(), unitcount.toString()) as Int) else 0

public actual fun WinBioEnumDatabases(factor: UInt, storageschemaarray: Long, storagecount: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases(factor.toInt(), storageschemaarray.toString(), storagecount.toString()) as Int) else 0

public actual fun WinBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: Long, subfactorarray: Long, subfactorcount: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), identity.toString(), subfactorarray.toString(), subfactorcount.toString()) as Int) else 0

public actual fun WinBioEnumServiceProviders(factor: UInt, bspschemaarray: Long, bspcount: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders(factor.toInt(), bspschemaarray.toString(), bspcount.toString()) as Int) else 0

public actual fun WinBioFree(address: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioFree(address.toString()) as Int) else 0

public actual fun WinBioGetCredentialState(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE, credentialstate: Long): HRESULT =
    0

public actual fun WinBioGetDomainLogonSetting(value: Long, source: Long) {
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) {
        _windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting(value.toString(), source.toString())
    }
}

public actual fun WinBioGetEnabledSetting(value: Long, source: Long) {
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) {
        _windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting(value.toString(), source.toString())
    }
}

public actual fun WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors(accountowner.toString(), enrolledfactors.toString()) as Int) else 0

public actual fun WinBioGetLogonSetting(value: Long, source: Long) {
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) {
        _windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting(value.toString(), source.toString())
    }
}

public actual fun WinBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.toString(), subfactor.toInt(), propertybuffer.toString(), propertybuffersize.toString()) as Int) else 0

public actual fun WinBioIdentify(sessionhandle: UInt, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioIdentify(sessionhandle.toInt(), unitid.toString(), identity.toString(), subfactor.toString(), rejectdetail.toString()) as Int) else 0

public actual fun WinBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PWINBIO_IDENTIFY_CALLBACK, identifycallbackcontext: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback(sessionhandle.toInt(), identifycallback.toLong().toString(), identifycallbackcontext.toString()) as Int) else 0

public actual fun WinBioImproveBegin(sessionhandle: UInt, unitid: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin(sessionhandle.toInt(), unitid.toInt()) as Int) else 0

public actual fun WinBioImproveEnd(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd(sessionhandle.toInt()) as Int) else 0

public actual fun WinBioLocateSensor(sessionhandle: UInt, unitid: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor(sessionhandle.toInt(), unitid.toString()) as Int) else 0

public actual fun WinBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PWINBIO_LOCATE_SENSOR_CALLBACK, locatecallbackcontext: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback(sessionhandle.toInt(), locatecallback.toLong().toString(), locatecallbackcontext.toString()) as Int) else 0

public actual fun WinBioLockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioLockUnit(sessionhandle.toInt(), unitid.toInt()) as Int) else 0

public actual fun WinBioLogonIdentifiedUser(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser(sessionhandle.toInt()) as Int) else 0

public actual fun WinBioMonitorPresence(sessionhandle: UInt, unitid: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence(sessionhandle.toInt(), unitid.toInt()) as Int) else 0

public actual fun WinBioOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, sessionhandle: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.toString(), unitcount.toString(), databaseid.toString(), sessionhandle.toString()) as Int) else 0

public actual fun WinBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PWINBIO_EVENT_CALLBACK, eventcallbackcontext: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), eventcallback.toLong().toString(), eventcallbackcontext.toString()) as Int) else 0

public actual fun WinBioReleaseFocus(): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus() as Int) else 0

public actual fun WinBioRemoveAllCredentials(): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials() as Int) else 0

public actual fun WinBioRemoveAllDomainCredentials(): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials() as Int) else 0

public actual fun WinBioRemoveCredential(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE): HRESULT =
    0

public actual fun WinBioSetCredential(type: WINBIO_CREDENTIAL_TYPE, credential: Long, credentialsize: ULong, format: WINBIO_CREDENTIAL_FORMAT): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioSetCredential(type, credential.toString(), credentialsize.toString(), format) as Int) else 0

public actual fun WinBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: ULong): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.toString(), subfactor.toInt(), propertybuffer.toString(), propertybuffersize.toString()) as Int) else 0

public actual fun WinBioUnlockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit(sessionhandle.toInt(), unitid.toInt()) as Int) else 0

public actual fun WinBioUnregisterEventMonitor(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor(sessionhandle.toInt()) as Int) else 0

public actual fun WinBioVerify(sessionhandle: UInt, identity: Long, subfactor: UByte, unitid: Long, match: Long, rejectdetail: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioVerify(sessionhandle.toInt(), identity.toString(), subfactor.toInt(), unitid.toString(), match.toString(), rejectdetail.toString()) as Int) else 0

public actual fun WinBioVerifyWithCallback(sessionhandle: UInt, identity: Long, subfactor: UByte, verifycallback: PWINBIO_VERIFY_CALLBACK, verifycallbackcontext: Long): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback(sessionhandle.toInt(), identity.toString(), subfactor.toInt(), verifycallback.toLong().toString(), verifycallbackcontext.toString()) as Int) else 0

public actual fun WinBioWait(sessionhandle: UInt): HRESULT =
    if (_windowsWin32DevicesBiometricframeworkNapiAddon != null) (_windowsWin32DevicesBiometricframeworkNapiAddon.windowssys_windows_win32_devices_biometricframework_WinBioWait(sessionhandle.toInt()) as Int) else 0

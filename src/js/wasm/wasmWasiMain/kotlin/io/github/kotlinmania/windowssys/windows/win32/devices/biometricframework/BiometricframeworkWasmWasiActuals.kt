@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus(): Int

public actual fun winBioAcquireFocus(): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle: Int, factor: Int): Int

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle: Int, factor: Int): Int

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle: Int, factor: Int): Int

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle: Int, changetypes: Int): Int

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt())

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr<CVoid>, asynchronousopen: Bool, frameworkhandle: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework")

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr<UInt>, unitcount: ULong, databaseid: ConstPtr<Guid>, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr<CVoid>, asynchronousopen: Bool, sessionhandle: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle: Int): Int

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle.toInt())

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr<UInt>, sample: MutPtr<MutPtr<WinbioBir>>, samplesize: MutPtr<ULong>, rejectdetail: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample")

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle: Int): Int

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle: Int): Int

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle.toInt())

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit")

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged")

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle: Int, subfactor: Int, unitid: Int): Int

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle.toInt(), subfactor.toInt(), unitid.toInt())

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture")

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback")

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr<WinbioIdentity>, isnewtemplate: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle: Int): Int

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle: Int, selectorvalue: Long): Int

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toLong())

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr<MutPtr<WinbioUnitSchema>>, unitcount: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits")

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr<MutPtr<WinbioStorageSchema>>, storagecount: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases")

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactorarray: MutPtr<MutPtr<UByte>>, subfactorcount: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments")

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr<MutPtr<WinbioBspSchema>>, bspcount: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders")

public actual fun winBioFree(address: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioFree")

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr<WinbioCredentialState>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioGetCredentialState")

public actual fun winBioGetDomainLogonSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting")

public actual fun winBioGetEnabledSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting")

public actual fun winBioGetEnrolledFactors(accountowner: ConstPtr<WinbioIdentity>, enrolledfactors: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors")

public actual fun winBioGetLogonSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting")

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: MutPtr<MutPtr<CVoid>>, propertybuffersize: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty")

public actual fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr<UInt>, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, rejectdetail: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify")

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle: Int, unitid: Int): Int

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle.toInt(), unitid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle: Int): Int

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle.toInt())

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor")

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle: Int, unitid: Int): Int

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle.toInt(), unitid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle: Int): Int

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle: Int, unitid: Int): Int

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr<UInt>, unitcount: ULong, databaseid: ConstPtr<Guid>, sessionhandle: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession")

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus(): Int

public actual fun winBioReleaseFocus(): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials(): Int

public actual fun winBioRemoveAllCredentials(): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials(): Int

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials()

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveCredential")

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr<UByte>, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential")

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: ConstPtr<CVoid>, propertybuffersize: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle: Int, unitid: Int): Int

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle.toInt(), unitid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle: Int): Int

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle.toInt())

public actual fun winBioVerify(sessionhandle: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, unitid: MutPtr<UInt>, match: MutPtr<UByte>, rejectdetail: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify")

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBiometricframeworkWinBioWait")
private external fun wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle: Int): Int

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle.toInt())

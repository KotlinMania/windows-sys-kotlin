@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun callEnclave(lproutine: Long, lpparameter: ConstPtr, fwaitforthread: Bool, lpreturnvalue: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentCallEnclave")

public actual fun createEnclave(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentCreateEnclave")

public actual fun createEnvironmentBlock(lpenvironment: MutPtr, htoken: Handle, binherit: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock")

public actual fun deleteEnclave(lpaddress: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentDeleteEnclave")

public actual fun destroyEnvironmentBlock(lpenvironment: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock")

public actual fun enclaveGetAttestationReport(enclavedata: ConstPtr, report: MutPtr, buffersize: UInt, outputsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport")

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation")

public actual fun enclaveSealData(datatoencrypt: ConstPtr, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr, buffersize: UInt, protectedblobsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentEnclaveSealData")

public actual fun enclaveUnsealData(protectedblob: ConstPtr, protectedblobsize: UInt, decrypteddata: MutPtr, buffersize: UInt, decrypteddatasize: MutPtr, sealingidentity: MutPtr, unsealingflags: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData")

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr, reportsize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport")

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA")

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA")

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW")

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW")

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA")

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW")

public actual fun getCommandLineA(): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetCommandLineA")

public actual fun getCommandLineW(): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetCommandLineW")

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA")

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW")

public actual fun getEnvironmentStrings(): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings")

public actual fun getEnvironmentStringsW(): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW")

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA")

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW")

public actual fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentInitializeEnclave")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported")
private external fun wasiWindowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype: Int): Int

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    wasiWindowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype.toInt())

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr, lpenclaveerror: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentLoadEnclaveData")

public actual fun loadEnclaveImageA(lpenclaveaddress: ConstPtr, lpimagename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA")

public actual fun loadEnclaveImageW(lpenclaveaddress: ConstPtr, lpimagename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW")

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA")

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW")

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA")

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW")

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW")

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA")

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW")

public actual fun terminateEnclave(lpaddress: ConstPtr, fwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEnvironmentTerminateEnclave")

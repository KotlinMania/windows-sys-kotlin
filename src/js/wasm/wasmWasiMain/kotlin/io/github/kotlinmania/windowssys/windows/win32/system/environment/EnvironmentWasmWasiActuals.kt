@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun callEnclave(lproutine: Long, lpparameter: COpaquePointer?, fwaitforthread: Bool, lpreturnvalue: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createEnclave(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createEnvironmentBlock(lpenvironment: COpaquePointer?, htoken: Handle, binherit: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteEnclave(lpaddress: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyEnvironmentBlock(lpenvironment: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enclaveGetAttestationReport(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enclaveSealData(datatoencrypt: COpaquePointer?, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: COpaquePointer?, buffersize: UInt, protectedblobsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enclaveUnsealData(protectedblob: COpaquePointer?, protectedblobsize: UInt, decrypteddata: COpaquePointer?, buffersize: UInt, decrypteddatasize: COpaquePointer?, sealingidentity: COpaquePointer?, unsealingflags: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: COpaquePointer?, reportsize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommandLineA(): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCommandLineW(): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnvironmentStrings(): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnvironmentStringsW(): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeEnclave(hprocess: Handle, lpaddress: COpaquePointer?, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, flprotect: UInt, lppageinformation: COpaquePointer?, dwinfolength: UInt, lpnumberofbyteswritten: COpaquePointer?, lpenclaveerror: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadEnclaveImageA(lpenclaveaddress: COpaquePointer?, lpimagename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadEnclaveImageW(lpenclaveaddress: COpaquePointer?, lpimagename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun terminateEnclave(lpaddress: COpaquePointer?, fwait: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

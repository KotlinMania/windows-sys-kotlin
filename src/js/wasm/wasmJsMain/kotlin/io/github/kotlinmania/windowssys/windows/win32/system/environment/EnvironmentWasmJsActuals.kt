@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: BOOL, lpreturnvalue: Long): BOOL =
    0

public actual fun CreateEnclave(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): Long =
    0L

public actual fun CreateEnvironmentBlock(lpenvironment: Long, htoken: HANDLE, binherit: BOOL): BOOL =
    0

public actual fun DeleteEnclave(lpaddress: Long): BOOL =
    0

public actual fun DestroyEnvironmentBlock(lpenvironment: Long): BOOL =
    0

public actual fun EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): HRESULT =
    0

public actual fun EnclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: Long): HRESULT =
    0

public actual fun EnclaveSealData(datatoencrypt: Long, datatoencryptsize: UInt, identitypolicy: ENCLAVE_SEALING_IDENTITY_POLICY, runtimepolicy: UInt, protectedblob: Long, buffersize: UInt, protectedblobsize: Long): HRESULT =
    0

public actual fun EnclaveUnsealData(protectedblob: Long, protectedblobsize: UInt, decrypteddata: Long, buffersize: UInt, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): HRESULT =
    0

public actual fun EnclaveVerifyAttestationReport(enclavetype: UInt, report: Long, reportsize: UInt): HRESULT =
    0

public actual fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    0u

public actual fun ExpandEnvironmentStringsForUserA(htoken: HANDLE, lpsrc: PCSTR, lpdest: PSTR, dwsize: UInt): BOOL =
    0

public actual fun ExpandEnvironmentStringsForUserW(htoken: HANDLE, lpsrc: PCWSTR, lpdest: PWSTR, dwsize: UInt): BOOL =
    0

public actual fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    0u

public actual fun FreeEnvironmentStringsA(penv: PCSTR): BOOL =
    0

public actual fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL =
    0

public actual fun GetCommandLineA(): PCSTR =
    0L

public actual fun GetCommandLineW(): PCWSTR =
    0L

public actual fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    0u

public actual fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    0u

public actual fun GetEnvironmentStrings(): PSTR =
    0L

public actual fun GetEnvironmentStringsW(): PWSTR =
    0L

public actual fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    0u

public actual fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    0u

public actual fun InitializeEnclave(hprocess: HANDLE, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): BOOL =
    0

public actual fun IsEnclaveTypeSupported(flenclavetype: UInt): BOOL =
    0

public actual fun LoadEnclaveData(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, nsize: ULong, flprotect: UInt, lppageinformation: Long, dwinfolength: UInt, lpnumberofbyteswritten: Long, lpenclaveerror: Long): BOOL =
    0

public actual fun LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: PCSTR): BOOL =
    0

public actual fun LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: PCWSTR): BOOL =
    0

public actual fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL =
    0

public actual fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    0

public actual fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    0

public actual fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    0

public actual fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL =
    0

public actual fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    0

public actual fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    0

public actual fun TerminateEnclave(lpaddress: Long, fwait: BOOL): BOOL =
    0

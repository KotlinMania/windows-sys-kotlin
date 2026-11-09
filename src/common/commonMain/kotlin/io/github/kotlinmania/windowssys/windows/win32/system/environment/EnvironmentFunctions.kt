package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: BOOL, lpreturnvalue: Long): BOOL

public expect fun CreateEnclave(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): Long

public expect fun CreateEnvironmentBlock(lpenvironment: Long, htoken: HANDLE, binherit: BOOL): BOOL

public expect fun DeleteEnclave(lpaddress: Long): BOOL

public expect fun DestroyEnvironmentBlock(lpenvironment: Long): BOOL

public expect fun EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): HRESULT

public expect fun EnclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: Long): HRESULT

public expect fun EnclaveSealData(datatoencrypt: Long, datatoencryptsize: UInt, identitypolicy: ENCLAVE_SEALING_IDENTITY_POLICY, runtimepolicy: UInt, protectedblob: Long, buffersize: UInt, protectedblobsize: Long): HRESULT

public expect fun EnclaveUnsealData(protectedblob: Long, protectedblobsize: UInt, decrypteddata: Long, buffersize: UInt, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): HRESULT

public expect fun EnclaveVerifyAttestationReport(enclavetype: UInt, report: Long, reportsize: UInt): HRESULT

public expect fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt

public expect fun ExpandEnvironmentStringsForUserA(htoken: HANDLE, lpsrc: PCSTR, lpdest: PSTR, dwsize: UInt): BOOL

public expect fun ExpandEnvironmentStringsForUserW(htoken: HANDLE, lpsrc: PCWSTR, lpdest: PWSTR, dwsize: UInt): BOOL

public expect fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt

public expect fun FreeEnvironmentStringsA(penv: PCSTR): BOOL

public expect fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL

public expect fun GetCommandLineA(): PCSTR

public expect fun GetCommandLineW(): PCWSTR

public expect fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt

public expect fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt

public expect fun GetEnvironmentStrings(): PSTR

public expect fun GetEnvironmentStringsW(): PWSTR

public expect fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt

public expect fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt

public expect fun InitializeEnclave(hprocess: HANDLE, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): BOOL

public expect fun IsEnclaveTypeSupported(flenclavetype: UInt): BOOL

public expect fun LoadEnclaveData(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, nsize: ULong, flprotect: UInt, lppageinformation: Long, dwinfolength: UInt, lpnumberofbyteswritten: Long, lpenclaveerror: Long): BOOL

public expect fun LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: PCSTR): BOOL

public expect fun LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: PCWSTR): BOOL

public expect fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL

public expect fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL

public expect fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL

public expect fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL

public expect fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL

public expect fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL

public expect fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL

public expect fun TerminateEnclave(lpaddress: Long, fwait: BOOL): BOOL

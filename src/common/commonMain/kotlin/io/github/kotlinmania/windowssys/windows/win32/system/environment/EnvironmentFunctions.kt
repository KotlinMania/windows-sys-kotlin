package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: BOOL, lpreturnvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("vertdll.dll", "CallEnclave", longArrayOf(lproutine, lpparameter, fwaitforthread.toLong(), lpreturnvalue)).toInt()
}

public fun CreateEnclave(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateEnclave", longArrayOf(hprocess, lpaddress, dwsize.toLong(), dwinitialcommitment.toLong(), flenclavetype.toLong(), lpenclaveinformation, dwinfolength.toLong(), lpenclaveerror))
}

public fun CreateEnvironmentBlock(lpenvironment: Long, htoken: HANDLE, binherit: BOOL): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "CreateEnvironmentBlock", longArrayOf(lpenvironment, htoken, binherit.toLong())).toInt()
}

public fun DeleteEnclave(lpaddress: Long): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-enclave-l1-1-1.dll", "DeleteEnclave", longArrayOf(lpaddress)).toInt()
}

public fun DestroyEnvironmentBlock(lpenvironment: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "DestroyEnvironmentBlock", longArrayOf(lpenvironment)).toInt()
}

public fun EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("vertdll.dll", "EnclaveGetAttestationReport", longArrayOf(enclavedata, report, buffersize.toLong(), outputsize)).toInt()
}

public fun EnclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: Long): HRESULT {
    return Win32DynamicFfi.invoke("vertdll.dll", "EnclaveGetEnclaveInformation", longArrayOf(informationsize.toLong(), enclaveinformation)).toInt()
}

public fun EnclaveSealData(datatoencrypt: Long, datatoencryptsize: UInt, identitypolicy: ENCLAVE_SEALING_IDENTITY_POLICY, runtimepolicy: UInt, protectedblob: Long, buffersize: UInt, protectedblobsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("vertdll.dll", "EnclaveSealData", longArrayOf(datatoencrypt, datatoencryptsize.toLong(), identitypolicy.toLong(), runtimepolicy.toLong(), protectedblob, buffersize.toLong(), protectedblobsize)).toInt()
}

public fun EnclaveUnsealData(protectedblob: Long, protectedblobsize: UInt, decrypteddata: Long, buffersize: UInt, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("vertdll.dll", "EnclaveUnsealData", longArrayOf(protectedblob, protectedblobsize.toLong(), decrypteddata, buffersize.toLong(), decrypteddatasize, sealingidentity, unsealingflags)).toInt()
}

public fun EnclaveVerifyAttestationReport(enclavetype: UInt, report: Long, reportsize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vertdll.dll", "EnclaveVerifyAttestationReport", longArrayOf(enclavetype.toLong(), report, reportsize.toLong())).toInt()
}

public fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ExpandEnvironmentStringsA", longArrayOf(lpsrc, lpdst, nsize.toLong())).toUInt()
}

public fun ExpandEnvironmentStringsForUserA(htoken: HANDLE, lpsrc: PCSTR, lpdest: PSTR, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "ExpandEnvironmentStringsForUserA", longArrayOf(htoken, lpsrc, lpdest, dwsize.toLong())).toInt()
}

public fun ExpandEnvironmentStringsForUserW(htoken: HANDLE, lpsrc: PCWSTR, lpdest: PWSTR, dwsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "ExpandEnvironmentStringsForUserW", longArrayOf(htoken, lpsrc, lpdest, dwsize.toLong())).toInt()
}

public fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "ExpandEnvironmentStringsW", longArrayOf(lpsrc, lpdst, nsize.toLong())).toUInt()
}

public fun FreeEnvironmentStringsA(penv: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeEnvironmentStringsA", longArrayOf(penv)).toInt()
}

public fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FreeEnvironmentStringsW", longArrayOf(penv)).toInt()
}

public fun GetCommandLineA(): PCSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommandLineA", longArrayOf())
}

public fun GetCommandLineW(): PCWSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCommandLineW", longArrayOf())
}

public fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentDirectoryA", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentDirectoryW", longArrayOf(nbufferlength.toLong(), lpbuffer)).toUInt()
}

public fun GetEnvironmentStrings(): PSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetEnvironmentStrings", longArrayOf())
}

public fun GetEnvironmentStringsW(): PWSTR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetEnvironmentStringsW", longArrayOf())
}

public fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetEnvironmentVariableA", longArrayOf(lpname, lpbuffer, nsize.toLong())).toUInt()
}

public fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetEnvironmentVariableW", longArrayOf(lpname, lpbuffer, nsize.toLong())).toUInt()
}

public fun InitializeEnclave(hprocess: HANDLE, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeEnclave", longArrayOf(hprocess, lpaddress, lpenclaveinformation, dwinfolength.toLong(), lpenclaveerror)).toInt()
}

public fun IsEnclaveTypeSupported(flenclavetype: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsEnclaveTypeSupported", longArrayOf(flenclavetype.toLong())).toInt()
}

public fun LoadEnclaveData(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, nsize: ULong, flprotect: UInt, lppageinformation: Long, dwinfolength: UInt, lpnumberofbyteswritten: Long, lpenclaveerror: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "LoadEnclaveData", longArrayOf(hprocess, lpaddress, lpbuffer, nsize.toLong(), flprotect.toLong(), lppageinformation, dwinfolength.toLong(), lpnumberofbyteswritten, lpenclaveerror)).toInt()
}

public fun LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-enclave-l1-1-1.dll", "LoadEnclaveImageA", longArrayOf(lpenclaveaddress, lpimagename)).toInt()
}

public fun LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-core-enclave-l1-1-1.dll", "LoadEnclaveImageW", longArrayOf(lpenclaveaddress, lpimagename)).toInt()
}

public fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "NeedCurrentDirectoryForExePathA", longArrayOf(exename)).toInt()
}

public fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "NeedCurrentDirectoryForExePathW", longArrayOf(exename)).toInt()
}

public fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCurrentDirectoryA", longArrayOf(lppathname)).toInt()
}

public fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetCurrentDirectoryW", longArrayOf(lppathname)).toInt()
}

public fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEnvironmentStringsW", longArrayOf(newenvironment)).toInt()
}

public fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEnvironmentVariableA", longArrayOf(lpname, lpvalue)).toInt()
}

public fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetEnvironmentVariableW", longArrayOf(lpname, lpvalue)).toInt()
}

public fun TerminateEnclave(lpaddress: Long, fwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("vertdll.dll", "TerminateEnclave", longArrayOf(lpaddress, fwait.toLong())).toInt()
}

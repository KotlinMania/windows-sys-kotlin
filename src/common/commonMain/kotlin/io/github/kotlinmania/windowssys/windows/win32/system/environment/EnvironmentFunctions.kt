package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun callEnclave(lproutine: Long, lpparameter: COpaquePointer?, fwaitforthread: Bool, lpreturnvalue: COpaquePointer?): Bool

public expect fun createEnclave(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): COpaquePointer?

public expect fun createEnvironmentBlock(lpenvironment: COpaquePointer?, htoken: Handle, binherit: Bool): Bool

public expect fun deleteEnclave(lpaddress: COpaquePointer?): Bool

public expect fun destroyEnvironmentBlock(lpenvironment: COpaquePointer?): Bool

public expect fun enclaveGetAttestationReport(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Hresult

public expect fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: COpaquePointer?): Hresult

public expect fun enclaveSealData(datatoencrypt: COpaquePointer?, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: COpaquePointer?, buffersize: UInt, protectedblobsize: COpaquePointer?): Hresult

public expect fun enclaveUnsealData(protectedblob: COpaquePointer?, protectedblobsize: UInt, decrypteddata: COpaquePointer?, buffersize: UInt, decrypteddatasize: COpaquePointer?, sealingidentity: COpaquePointer?, unsealingflags: COpaquePointer?): Hresult

public expect fun enclaveVerifyAttestationReport(enclavetype: UInt, report: COpaquePointer?, reportsize: UInt): Hresult

public expect fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt

public expect fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool

public expect fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool

public expect fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt

public expect fun freeEnvironmentStringsA(penv: Pcstr): Bool

public expect fun freeEnvironmentStringsW(penv: Pcwstr): Bool

public expect fun getCommandLineA(): Pcstr

public expect fun getCommandLineW(): Pcwstr

public expect fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getEnvironmentStrings(): Pstr

public expect fun getEnvironmentStringsW(): Pwstr

public expect fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt

public expect fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt

public expect fun initializeEnclave(hprocess: Handle, lpaddress: COpaquePointer?, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): Bool

public expect fun isEnclaveTypeSupported(flenclavetype: UInt): Bool

public expect fun loadEnclaveData(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, flprotect: UInt, lppageinformation: COpaquePointer?, dwinfolength: UInt, lpnumberofbyteswritten: COpaquePointer?, lpenclaveerror: COpaquePointer?): Bool

public expect fun loadEnclaveImageA(lpenclaveaddress: COpaquePointer?, lpimagename: Pcstr): Bool

public expect fun loadEnclaveImageW(lpenclaveaddress: COpaquePointer?, lpimagename: Pcwstr): Bool

public expect fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool

public expect fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool

public expect fun setCurrentDirectoryA(lppathname: Pcstr): Bool

public expect fun setCurrentDirectoryW(lppathname: Pcwstr): Bool

public expect fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool

public expect fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool

public expect fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool

public expect fun terminateEnclave(lpaddress: COpaquePointer?, fwait: Bool): Bool

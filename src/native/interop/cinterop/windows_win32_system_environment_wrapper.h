#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemEnvironmentCallEnclave(int64_t lproutine, void* lpparameter, int32_t fwaitforthread, void* lpreturnvalue);
void* windowssysWindowsWin32SystemEnvironmentCreateEnclave(void* hprocess, void* lpaddress, uint64_t dwsize, uint64_t dwinitialcommitment, uint32_t flenclavetype, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror);
int32_t windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(void* lpenvironment, void* htoken, int32_t binherit);
int32_t windowssysWindowsWin32SystemEnvironmentDeleteEnclave(void* lpaddress);
int32_t windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(void* lpenvironment);
int32_t windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(void* enclavedata, void* report, uint32_t buffersize, void* outputsize);
int32_t windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(uint32_t informationsize, void* enclaveinformation);
int32_t windowssysWindowsWin32SystemEnvironmentEnclaveSealData(void* datatoencrypt, uint32_t datatoencryptsize, int32_t identitypolicy, uint32_t runtimepolicy, void* protectedblob, uint32_t buffersize, void* protectedblobsize);
int32_t windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(void* protectedblob, uint32_t protectedblobsize, void* decrypteddata, uint32_t buffersize, void* decrypteddatasize, void* sealingidentity, void* unsealingflags);
int32_t windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(uint32_t enclavetype, void* report, uint32_t reportsize);
uint32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(void* lpsrc, void* lpdst, uint32_t nsize);
int32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize);
int32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize);
uint32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(void* lpsrc, void* lpdst, uint32_t nsize);
int32_t windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(void* penv);
int32_t windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(void* penv);
void* windowssysWindowsWin32SystemEnvironmentGetCommandLineA(void);
void* windowssysWindowsWin32SystemEnvironmentGetCommandLineW(void);
uint32_t windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(uint32_t nbufferlength, void* lpbuffer);
void* windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings(void);
void* windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW(void);
uint32_t windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(void* lpname, void* lpbuffer, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(void* lpname, void* lpbuffer, uint32_t nsize);
int32_t windowssysWindowsWin32SystemEnvironmentInitializeEnclave(void* hprocess, void* lpaddress, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror);
int32_t windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(uint32_t flenclavetype);
int32_t windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t nsize, uint32_t flprotect, void* lppageinformation, uint32_t dwinfolength, void* lpnumberofbyteswritten, void* lpenclaveerror);
int32_t windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(void* lpenclaveaddress, void* lpimagename);
int32_t windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(void* lpenclaveaddress, void* lpimagename);
int32_t windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(void* exename);
int32_t windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(void* exename);
int32_t windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(void* lppathname);
int32_t windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(void* lppathname);
int32_t windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(void* newenvironment);
int32_t windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(void* lpname, void* lpvalue);
int32_t windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(void* lpname, void* lpvalue);
int32_t windowssysWindowsWin32SystemEnvironmentTerminateEnclave(void* lpaddress, int32_t fwait);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H */

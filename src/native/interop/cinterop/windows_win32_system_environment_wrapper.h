#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_environment_CallEnclave(int64_t lproutine, void* lpparameter, int32_t fwaitforthread, void* lpreturnvalue);
void* windowssys_windows_win32_system_environment_CreateEnclave(void* hprocess, void* lpaddress, uint64_t dwsize, uint64_t dwinitialcommitment, uint32_t flenclavetype, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror);
int32_t windowssys_windows_win32_system_environment_CreateEnvironmentBlock(void* lpenvironment, void* htoken, int32_t binherit);
int32_t windowssys_windows_win32_system_environment_DeleteEnclave(void* lpaddress);
int32_t windowssys_windows_win32_system_environment_DestroyEnvironmentBlock(void* lpenvironment);
int32_t windowssys_windows_win32_system_environment_EnclaveGetAttestationReport(void* enclavedata, void* report, uint32_t buffersize, void* outputsize);
int32_t windowssys_windows_win32_system_environment_EnclaveGetEnclaveInformation(uint32_t informationsize, void* enclaveinformation);
int32_t windowssys_windows_win32_system_environment_EnclaveSealData(void* datatoencrypt, uint32_t datatoencryptsize, int32_t identitypolicy, uint32_t runtimepolicy, void* protectedblob, uint32_t buffersize, void* protectedblobsize);
int32_t windowssys_windows_win32_system_environment_EnclaveUnsealData(void* protectedblob, uint32_t protectedblobsize, void* decrypteddata, uint32_t buffersize, void* decrypteddatasize, void* sealingidentity, void* unsealingflags);
int32_t windowssys_windows_win32_system_environment_EnclaveVerifyAttestationReport(uint32_t enclavetype, void* report, uint32_t reportsize);
uint32_t windowssys_windows_win32_system_environment_ExpandEnvironmentStringsA(void* lpsrc, void* lpdst, uint32_t nsize);
int32_t windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserA(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize);
int32_t windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserW(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize);
uint32_t windowssys_windows_win32_system_environment_ExpandEnvironmentStringsW(void* lpsrc, void* lpdst, uint32_t nsize);
int32_t windowssys_windows_win32_system_environment_FreeEnvironmentStringsA(void* penv);
int32_t windowssys_windows_win32_system_environment_FreeEnvironmentStringsW(void* penv);
void* windowssys_windows_win32_system_environment_GetCommandLineA(void);
void* windowssys_windows_win32_system_environment_GetCommandLineW(void);
uint32_t windowssys_windows_win32_system_environment_GetCurrentDirectoryA(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssys_windows_win32_system_environment_GetCurrentDirectoryW(uint32_t nbufferlength, void* lpbuffer);
void* windowssys_windows_win32_system_environment_GetEnvironmentStrings(void);
void* windowssys_windows_win32_system_environment_GetEnvironmentStringsW(void);
uint32_t windowssys_windows_win32_system_environment_GetEnvironmentVariableA(void* lpname, void* lpbuffer, uint32_t nsize);
uint32_t windowssys_windows_win32_system_environment_GetEnvironmentVariableW(void* lpname, void* lpbuffer, uint32_t nsize);
int32_t windowssys_windows_win32_system_environment_InitializeEnclave(void* hprocess, void* lpaddress, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror);
int32_t windowssys_windows_win32_system_environment_IsEnclaveTypeSupported(uint32_t flenclavetype);
int32_t windowssys_windows_win32_system_environment_LoadEnclaveData(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t nsize, uint32_t flprotect, void* lppageinformation, uint32_t dwinfolength, void* lpnumberofbyteswritten, void* lpenclaveerror);
int32_t windowssys_windows_win32_system_environment_LoadEnclaveImageA(void* lpenclaveaddress, void* lpimagename);
int32_t windowssys_windows_win32_system_environment_LoadEnclaveImageW(void* lpenclaveaddress, void* lpimagename);
int32_t windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathA(void* exename);
int32_t windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathW(void* exename);
int32_t windowssys_windows_win32_system_environment_SetCurrentDirectoryA(void* lppathname);
int32_t windowssys_windows_win32_system_environment_SetCurrentDirectoryW(void* lppathname);
int32_t windowssys_windows_win32_system_environment_SetEnvironmentStringsW(void* newenvironment);
int32_t windowssys_windows_win32_system_environment_SetEnvironmentVariableA(void* lpname, void* lpvalue);
int32_t windowssys_windows_win32_system_environment_SetEnvironmentVariableW(void* lpname, void* lpvalue);
int32_t windowssys_windows_win32_system_environment_TerminateEnclave(void* lpaddress, int32_t fwait);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H */

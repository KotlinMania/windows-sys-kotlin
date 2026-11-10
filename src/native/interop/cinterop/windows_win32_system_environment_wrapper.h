#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_environment_callEnclave(int64_t lproutine, void* lpparameter, int32_t fwaitforthread, void* lpreturnvalue);
void* windowssys_windows_win32_system_environment_createEnclave(void* hprocess, void* lpaddress, uint64_t dwsize, uint64_t dwinitialcommitment, uint32_t flenclavetype, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror);
int32_t windowssys_windows_win32_system_environment_createEnvironmentBlock(void* lpenvironment, void* htoken, int32_t binherit);
int32_t windowssys_windows_win32_system_environment_deleteEnclave(void* lpaddress);
int32_t windowssys_windows_win32_system_environment_destroyEnvironmentBlock(void* lpenvironment);
int32_t windowssys_windows_win32_system_environment_enclaveGetAttestationReport(void* enclavedata, void* report, uint32_t buffersize, void* outputsize);
int32_t windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(uint32_t informationsize, void* enclaveinformation);
int32_t windowssys_windows_win32_system_environment_enclaveSealData(void* datatoencrypt, uint32_t datatoencryptsize, int32_t identitypolicy, uint32_t runtimepolicy, void* protectedblob, uint32_t buffersize, void* protectedblobsize);
int32_t windowssys_windows_win32_system_environment_enclaveUnsealData(void* protectedblob, uint32_t protectedblobsize, void* decrypteddata, uint32_t buffersize, void* decrypteddatasize, void* sealingidentity, void* unsealingflags);
int32_t windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(uint32_t enclavetype, void* report, uint32_t reportsize);
uint32_t windowssys_windows_win32_system_environment_expandEnvironmentStringsA(void* lpsrc, void* lpdst, uint32_t nsize);
int32_t windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize);
int32_t windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize);
uint32_t windowssys_windows_win32_system_environment_expandEnvironmentStringsW(void* lpsrc, void* lpdst, uint32_t nsize);
int32_t windowssys_windows_win32_system_environment_freeEnvironmentStringsA(void* penv);
int32_t windowssys_windows_win32_system_environment_freeEnvironmentStringsW(void* penv);
void* windowssys_windows_win32_system_environment_getCommandLineA(void);
void* windowssys_windows_win32_system_environment_getCommandLineW(void);
uint32_t windowssys_windows_win32_system_environment_getCurrentDirectoryA(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssys_windows_win32_system_environment_getCurrentDirectoryW(uint32_t nbufferlength, void* lpbuffer);
void* windowssys_windows_win32_system_environment_getEnvironmentStrings(void);
void* windowssys_windows_win32_system_environment_getEnvironmentStringsW(void);
uint32_t windowssys_windows_win32_system_environment_getEnvironmentVariableA(void* lpname, void* lpbuffer, uint32_t nsize);
uint32_t windowssys_windows_win32_system_environment_getEnvironmentVariableW(void* lpname, void* lpbuffer, uint32_t nsize);
int32_t windowssys_windows_win32_system_environment_initializeEnclave(void* hprocess, void* lpaddress, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror);
int32_t windowssys_windows_win32_system_environment_isEnclaveTypeSupported(uint32_t flenclavetype);
int32_t windowssys_windows_win32_system_environment_loadEnclaveData(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t nsize, uint32_t flprotect, void* lppageinformation, uint32_t dwinfolength, void* lpnumberofbyteswritten, void* lpenclaveerror);
int32_t windowssys_windows_win32_system_environment_loadEnclaveImageA(void* lpenclaveaddress, void* lpimagename);
int32_t windowssys_windows_win32_system_environment_loadEnclaveImageW(void* lpenclaveaddress, void* lpimagename);
int32_t windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA(void* exename);
int32_t windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW(void* exename);
int32_t windowssys_windows_win32_system_environment_setCurrentDirectoryA(void* lppathname);
int32_t windowssys_windows_win32_system_environment_setCurrentDirectoryW(void* lppathname);
int32_t windowssys_windows_win32_system_environment_setEnvironmentStringsW(void* newenvironment);
int32_t windowssys_windows_win32_system_environment_setEnvironmentVariableA(void* lpname, void* lpvalue);
int32_t windowssys_windows_win32_system_environment_setEnvironmentVariableW(void* lpname, void* lpvalue);
int32_t windowssys_windows_win32_system_environment_terminateEnclave(void* lpaddress, int32_t fwait);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WINDOWS_WIN32_SYSTEM_ENVIRONMENT_WRAPPER_H */

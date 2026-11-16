#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RECOVERY_WINDOWS_WIN32_SYSTEM_RECOVERY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RECOVERY_WINDOWS_WIN32_SYSTEM_RECOVERY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32SystemRecoveryApplicationRecoveryFinished(int32_t bsuccess);
int32_t windowssysWindowsWin32SystemRecoveryApplicationRecoveryInProgress(void* pbcancelled);
int32_t windowssysWindowsWin32SystemRecoveryGetApplicationRecoveryCallback(void* hprocess, void* precoverycallback, void* ppvparameter, void* pdwpinginterval, void* pdwflags);
int32_t windowssysWindowsWin32SystemRecoveryGetApplicationRestartSettings(void* hprocess, void* pwzcommandline, void* pcchsize, void* pdwflags);
int32_t windowssysWindowsWin32SystemRecoveryRegisterApplicationRecoveryCallback(void* precoveycallback, void* pvparameter, uint32_t dwpinginterval, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemRecoveryRegisterApplicationRestart(void* pwzcommandline, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemRecoveryUnregisterApplicationRecoveryCallback(void);
int32_t windowssysWindowsWin32SystemRecoveryUnregisterApplicationRestart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RECOVERY_WINDOWS_WIN32_SYSTEM_RECOVERY_WRAPPER_H */

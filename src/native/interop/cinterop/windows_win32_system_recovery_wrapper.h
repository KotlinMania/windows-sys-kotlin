#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RECOVERY_WINDOWS_WIN32_SYSTEM_RECOVERY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RECOVERY_WINDOWS_WIN32_SYSTEM_RECOVERY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_recovery_applicationRecoveryFinished(int32_t bsuccess);
int32_t windowssys_windows_win32_system_recovery_applicationRecoveryInProgress(void* pbcancelled);
int32_t windowssys_windows_win32_system_recovery_getApplicationRecoveryCallback(void* hprocess, void* precoverycallback, void* ppvparameter, void* pdwpinginterval, void* pdwflags);
int32_t windowssys_windows_win32_system_recovery_getApplicationRestartSettings(void* hprocess, void* pwzcommandline, void* pcchsize, void* pdwflags);
int32_t windowssys_windows_win32_system_recovery_registerApplicationRecoveryCallback(void* precoveycallback, void* pvparameter, uint32_t dwpinginterval, uint32_t dwflags);
int32_t windowssys_windows_win32_system_recovery_registerApplicationRestart(void* pwzcommandline, uint32_t dwflags);
int32_t windowssys_windows_win32_system_recovery_unregisterApplicationRecoveryCallback(void);
int32_t windowssys_windows_win32_system_recovery_unregisterApplicationRestart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RECOVERY_WINDOWS_WIN32_SYSTEM_RECOVERY_WRAPPER_H */

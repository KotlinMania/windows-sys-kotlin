#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_subsystemforlinux_WslConfigureDistribution(void* distributionname, uint32_t defaultuid, int32_t wsldistributionflags);
int32_t windowssys_windows_win32_system_subsystemforlinux_WslGetDistributionConfiguration(void* distributionname, void* distributionversion, void* defaultuid, void* wsldistributionflags, void* defaultenvironmentvariables, void* defaultenvironmentvariablecount);
int32_t windowssys_windows_win32_system_subsystemforlinux_WslIsDistributionRegistered(void* distributionname);
int32_t windowssys_windows_win32_system_subsystemforlinux_WslLaunch(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* arg_3_stdin, void* arg_4_stdout, void* arg_5_stderr, void* process);
int32_t windowssys_windows_win32_system_subsystemforlinux_WslLaunchInteractive(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* exitcode);
int32_t windowssys_windows_win32_system_subsystemforlinux_WslRegisterDistribution(void* distributionname, void* targzfilename);
int32_t windowssys_windows_win32_system_subsystemforlinux_WslUnregisterDistribution(void* distributionname);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H */

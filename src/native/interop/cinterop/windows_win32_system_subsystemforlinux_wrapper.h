#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_subsystemforlinux_wslConfigureDistribution(void* distributionname, uint32_t defaultuid, int32_t wsldistributionflags);
int32_t windowssys_windows_win32_system_subsystemforlinux_wslGetDistributionConfiguration(void* distributionname, void* distributionversion, void* defaultuid, void* wsldistributionflags, void* defaultenvironmentvariables, void* defaultenvironmentvariablecount);
int32_t windowssys_windows_win32_system_subsystemforlinux_wslIsDistributionRegistered(void* distributionname);
int32_t windowssys_windows_win32_system_subsystemforlinux_wslLaunch(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* arg_3_stdin, void* arg_4_stdout, void* arg_5_stderr, void* process);
int32_t windowssys_windows_win32_system_subsystemforlinux_wslLaunchInteractive(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* exitcode);
int32_t windowssys_windows_win32_system_subsystemforlinux_wslRegisterDistribution(void* distributionname, void* targzfilename);
int32_t windowssys_windows_win32_system_subsystemforlinux_wslUnregisterDistribution(void* distributionname);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H */

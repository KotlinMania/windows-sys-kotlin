#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_power_CallNtPowerInformation(int32_t informationlevel, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength);
bool windowssys_windows_win32_system_power_CanUserWritePwrScheme(void);
bool windowssys_windows_win32_system_power_DeletePwrScheme(uint32_t uiid);
bool windowssys_windows_win32_system_power_DevicePowerClose(void);
bool windowssys_windows_win32_system_power_DevicePowerEnumDevices(uint32_t queryindex, uint32_t queryinterpretationflags, uint32_t queryflags, void* preturnbuffer, void* pbuffersize);
bool windowssys_windows_win32_system_power_DevicePowerOpen(uint32_t debugmask);
uint32_t windowssys_windows_win32_system_power_DevicePowerSetDeviceState(void* devicedescription, uint32_t setflags, void* setdata);
bool windowssys_windows_win32_system_power_EnumPwrSchemes(void* lpfn, int64_t lparam);
bool windowssys_windows_win32_system_power_GetActivePwrScheme(void* puiid);
bool windowssys_windows_win32_system_power_GetCurrentPowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy);
int32_t windowssys_windows_win32_system_power_GetDevicePowerState(void* hdevice, void* pfon);
bool windowssys_windows_win32_system_power_GetPwrCapabilities(void* lpspc);
bool windowssys_windows_win32_system_power_GetPwrDiskSpindownRange(void* puimax, void* puimin);
int32_t windowssys_windows_win32_system_power_GetSystemPowerStatus(void* lpsystempowerstatus);
bool windowssys_windows_win32_system_power_IsAdminOverrideActive(void* papp);
bool windowssys_windows_win32_system_power_IsPwrHibernateAllowed(void);
bool windowssys_windows_win32_system_power_IsPwrShutdownAllowed(void);
bool windowssys_windows_win32_system_power_IsPwrSuspendAllowed(void);
int32_t windowssys_windows_win32_system_power_IsSystemResumeAutomatic(void);
uint32_t windowssys_windows_win32_system_power_PowerCanRestoreIndividualDefaultPowerScheme(void* schemeguid);
int32_t windowssys_windows_win32_system_power_PowerClearRequest(void* powerrequest, int32_t requesttype);
uint32_t windowssys_windows_win32_system_power_PowerCreatePossibleSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex);
void* windowssys_windows_win32_system_power_PowerCreateRequest(void* context);
uint32_t windowssys_windows_win32_system_power_PowerCreateSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid);
uint32_t windowssys_windows_win32_system_power_PowerDeleteScheme(void* rootpowerkey, void* schemeguid);
int32_t windowssys_windows_win32_system_power_PowerDeterminePlatformRole(void);
int32_t windowssys_windows_win32_system_power_PowerDeterminePlatformRoleEx(uint32_t version);
uint32_t windowssys_windows_win32_system_power_PowerDuplicateScheme(void* rootpowerkey, void* sourceschemeguid, void* destinationschemeguid);
uint32_t windowssys_windows_win32_system_power_PowerEnumerate(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, int32_t accessflags, uint32_t arg_4_index, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerGetActiveScheme(void* userrootpowerkey, void* activepolicyguid);
uint32_t windowssys_windows_win32_system_power_PowerImportPowerScheme(void* rootpowerkey, void* importfilenamepath, void* destinationschemeguid);
bool windowssys_windows_win32_system_power_PowerIsSettingRangeDefined(void* subkeyguid, void* settingguid);
uint32_t windowssys_windows_win32_system_power_PowerOpenSystemPowerKey(void* phsystempowerkey, uint32_t access, int32_t openexisting);
uint32_t windowssys_windows_win32_system_power_PowerOpenUserPowerKey(void* phuserpowerkey, uint32_t access, int32_t openexisting);
uint32_t windowssys_windows_win32_system_power_PowerReadACDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acdefaultindex);
uint32_t windowssys_windows_win32_system_power_PowerReadACValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acvalueindex);
uint32_t windowssys_windows_win32_system_power_PowerReadDCDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcdefaultindex);
uint32_t windowssys_windows_win32_system_power_PowerReadDCValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcvalueindex);
uint32_t windowssys_windows_win32_system_power_PowerReadDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadPossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadPossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadPossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_PowerReadSettingAttributes(void* subgroupguid, void* powersettingguid);
uint32_t windowssys_windows_win32_system_power_PowerReadValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueincrement);
uint32_t windowssys_windows_win32_system_power_PowerReadValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valuemaximum);
uint32_t windowssys_windows_win32_system_power_PowerReadValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueminimum);
uint32_t windowssys_windows_win32_system_power_PowerReadValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
int32_t windowssys_windows_win32_system_power_PowerRegisterForEffectivePowerModeNotifications(uint32_t version, void* callback, void* context, void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_PowerRegisterSuspendResumeNotification(uint32_t flags, void* recipient, void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_PowerRemovePowerSetting(void* powersettingsubkeyguid, void* powersettingguid);
uint32_t windowssys_windows_win32_system_power_PowerReplaceDefaultPowerSchemes(void);
uint32_t windowssys_windows_win32_system_power_PowerReportThermalEvent(void* event);
uint32_t windowssys_windows_win32_system_power_PowerRestoreDefaultPowerSchemes(void);
uint32_t windowssys_windows_win32_system_power_PowerRestoreIndividualDefaultPowerScheme(void* schemeguid);
uint32_t windowssys_windows_win32_system_power_PowerSetActiveScheme(void* userrootpowerkey, void* schemeguid);
int32_t windowssys_windows_win32_system_power_PowerSetRequest(void* powerrequest, int32_t requesttype);
uint32_t windowssys_windows_win32_system_power_PowerSettingAccessCheck(int32_t accessflags, void* powerguid);
uint32_t windowssys_windows_win32_system_power_PowerSettingAccessCheckEx(int32_t accessflags, void* powerguid, uint32_t accesstype);
uint32_t windowssys_windows_win32_system_power_PowerSettingRegisterNotification(void* settingguid, uint32_t flags, void* recipient, void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_PowerSettingUnregisterNotification(int64_t registrationhandle);
int32_t windowssys_windows_win32_system_power_PowerUnregisterFromEffectivePowerModeNotifications(void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_PowerUnregisterSuspendResumeNotification(int64_t registrationhandle);
uint32_t windowssys_windows_win32_system_power_PowerWriteACDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultacindex);
uint32_t windowssys_windows_win32_system_power_PowerWriteACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t acvalueindex);
uint32_t windowssys_windows_win32_system_power_PowerWriteDCDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultdcindex);
uint32_t windowssys_windows_win32_system_power_PowerWriteDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t dcvalueindex);
uint32_t windowssys_windows_win32_system_power_PowerWriteDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_PowerWriteFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_PowerWriteIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_PowerWritePossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_PowerWritePossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_PowerWritePossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t type, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_PowerWriteSettingAttributes(void* subgroupguid, void* powersettingguid, uint32_t attributes);
uint32_t windowssys_windows_win32_system_power_PowerWriteValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueincrement);
uint32_t windowssys_windows_win32_system_power_PowerWriteValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valuemaximum);
uint32_t windowssys_windows_win32_system_power_PowerWriteValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueminimum);
uint32_t windowssys_windows_win32_system_power_PowerWriteValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
bool windowssys_windows_win32_system_power_ReadGlobalPwrPolicy(void* pglobalpowerpolicy);
bool windowssys_windows_win32_system_power_ReadProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy);
bool windowssys_windows_win32_system_power_ReadPwrScheme(uint32_t uiid, void* ppowerpolicy);
int64_t windowssys_windows_win32_system_power_RegisterPowerSettingNotification(void* hrecipient, void* powersettingguid, uint32_t flags);
int64_t windowssys_windows_win32_system_power_RegisterSuspendResumeNotification(void* hrecipient, uint32_t flags);
int32_t windowssys_windows_win32_system_power_RequestWakeupLatency(int32_t latency);
bool windowssys_windows_win32_system_power_SetActivePwrScheme(uint32_t uiid, void* pglobalpowerpolicy, void* ppowerpolicy);
bool windowssys_windows_win32_system_power_SetSuspendState(bool bhibernate, bool bforce, bool bwakeupeventsdisabled);
int32_t windowssys_windows_win32_system_power_SetSystemPowerState(int32_t fsuspend, int32_t fforce);
uint32_t windowssys_windows_win32_system_power_SetThreadExecutionState(uint32_t esflags);
int32_t windowssys_windows_win32_system_power_UnregisterPowerSettingNotification(int64_t handle);
int32_t windowssys_windows_win32_system_power_UnregisterSuspendResumeNotification(int64_t handle);
bool windowssys_windows_win32_system_power_ValidatePowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy);
bool windowssys_windows_win32_system_power_WriteGlobalPwrPolicy(void* pglobalpowerpolicy);
bool windowssys_windows_win32_system_power_WriteProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy);
bool windowssys_windows_win32_system_power_WritePwrScheme(void* puiid, void* lpszschemename, void* lpszdescription, void* lpscheme);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H */

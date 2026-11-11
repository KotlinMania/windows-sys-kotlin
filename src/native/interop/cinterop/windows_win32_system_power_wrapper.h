#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_power_callNtPowerInformation(int32_t informationlevel, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength);
bool windowssys_windows_win32_system_power_canUserWritePwrScheme(void);
bool windowssys_windows_win32_system_power_deletePwrScheme(uint32_t uiid);
bool windowssys_windows_win32_system_power_devicePowerClose(void);
bool windowssys_windows_win32_system_power_devicePowerEnumDevices(uint32_t queryindex, uint32_t queryinterpretationflags, uint32_t queryflags, void* preturnbuffer, void* pbuffersize);
bool windowssys_windows_win32_system_power_devicePowerOpen(uint32_t debugmask);
uint32_t windowssys_windows_win32_system_power_devicePowerSetDeviceState(void* devicedescription, uint32_t setflags, void* setdata);
bool windowssys_windows_win32_system_power_enumPwrSchemes(void* lpfn, int64_t lparam);
bool windowssys_windows_win32_system_power_getActivePwrScheme(void* puiid);
bool windowssys_windows_win32_system_power_getCurrentPowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy);
int32_t windowssys_windows_win32_system_power_getDevicePowerState(void* hdevice, void* pfon);
bool windowssys_windows_win32_system_power_getPwrCapabilities(void* lpspc);
bool windowssys_windows_win32_system_power_getPwrDiskSpindownRange(void* puimax, void* puimin);
int32_t windowssys_windows_win32_system_power_getSystemPowerStatus(void* lpsystempowerstatus);
bool windowssys_windows_win32_system_power_isAdminOverrideActive(void* papp);
bool windowssys_windows_win32_system_power_isPwrHibernateAllowed(void);
bool windowssys_windows_win32_system_power_isPwrShutdownAllowed(void);
bool windowssys_windows_win32_system_power_isPwrSuspendAllowed(void);
int32_t windowssys_windows_win32_system_power_isSystemResumeAutomatic(void);
uint32_t windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme(void* schemeguid);
int32_t windowssys_windows_win32_system_power_powerClearRequest(void* powerrequest, int32_t requesttype);
uint32_t windowssys_windows_win32_system_power_powerCreatePossibleSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex);
void* windowssys_windows_win32_system_power_powerCreateRequest(void* context);
uint32_t windowssys_windows_win32_system_power_powerCreateSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid);
uint32_t windowssys_windows_win32_system_power_powerDeleteScheme(void* rootpowerkey, void* schemeguid);
int32_t windowssys_windows_win32_system_power_powerDeterminePlatformRole(void);
int32_t windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(uint32_t version);
uint32_t windowssys_windows_win32_system_power_powerDuplicateScheme(void* rootpowerkey, void* sourceschemeguid, void* destinationschemeguid);
uint32_t windowssys_windows_win32_system_power_powerEnumerate(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, int32_t accessflags, uint32_t arg_4_index, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerGetActiveScheme(void* userrootpowerkey, void* activepolicyguid);
uint32_t windowssys_windows_win32_system_power_powerImportPowerScheme(void* rootpowerkey, void* importfilenamepath, void* destinationschemeguid);
bool windowssys_windows_win32_system_power_powerIsSettingRangeDefined(void* subkeyguid, void* settingguid);
uint32_t windowssys_windows_win32_system_power_powerOpenSystemPowerKey(void* phsystempowerkey, uint32_t access, int32_t openexisting);
uint32_t windowssys_windows_win32_system_power_powerOpenUserPowerKey(void* phuserpowerkey, uint32_t access, int32_t openexisting);
uint32_t windowssys_windows_win32_system_power_powerReadACDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acdefaultindex);
uint32_t windowssys_windows_win32_system_power_powerReadACValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acvalueindex);
uint32_t windowssys_windows_win32_system_power_powerReadDCDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcdefaultindex);
uint32_t windowssys_windows_win32_system_power_powerReadDCValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcvalueindex);
uint32_t windowssys_windows_win32_system_power_powerReadDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadPossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadPossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadPossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_power_powerReadSettingAttributes(void* subgroupguid, void* powersettingguid);
uint32_t windowssys_windows_win32_system_power_powerReadValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueincrement);
uint32_t windowssys_windows_win32_system_power_powerReadValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valuemaximum);
uint32_t windowssys_windows_win32_system_power_powerReadValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueminimum);
uint32_t windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
int32_t windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(uint32_t version, void* callback, void* context, void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(uint32_t flags, void* recipient, void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_powerRemovePowerSetting(void* powersettingsubkeyguid, void* powersettingguid);
uint32_t windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes(void);
uint32_t windowssys_windows_win32_system_power_powerReportThermalEvent(void* event);
uint32_t windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes(void);
uint32_t windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme(void* schemeguid);
uint32_t windowssys_windows_win32_system_power_powerSetActiveScheme(void* userrootpowerkey, void* schemeguid);
int32_t windowssys_windows_win32_system_power_powerSetRequest(void* powerrequest, int32_t requesttype);
uint32_t windowssys_windows_win32_system_power_powerSettingAccessCheck(int32_t accessflags, void* powerguid);
uint32_t windowssys_windows_win32_system_power_powerSettingAccessCheckEx(int32_t accessflags, void* powerguid, uint32_t accesstype);
uint32_t windowssys_windows_win32_system_power_powerSettingRegisterNotification(void* settingguid, uint32_t flags, void* recipient, void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_powerSettingUnregisterNotification(int64_t registrationhandle);
int32_t windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications(void* registrationhandle);
uint32_t windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(int64_t registrationhandle);
uint32_t windowssys_windows_win32_system_power_powerWriteACDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultacindex);
uint32_t windowssys_windows_win32_system_power_powerWriteACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t acvalueindex);
uint32_t windowssys_windows_win32_system_power_powerWriteDCDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultdcindex);
uint32_t windowssys_windows_win32_system_power_powerWriteDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t dcvalueindex);
uint32_t windowssys_windows_win32_system_power_powerWriteDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_powerWriteFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_powerWritePossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_powerWritePossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_powerWritePossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t type, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_power_powerWriteSettingAttributes(void* subgroupguid, void* powersettingguid, uint32_t attributes);
uint32_t windowssys_windows_win32_system_power_powerWriteValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueincrement);
uint32_t windowssys_windows_win32_system_power_powerWriteValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valuemaximum);
uint32_t windowssys_windows_win32_system_power_powerWriteValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueminimum);
uint32_t windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
bool windowssys_windows_win32_system_power_readGlobalPwrPolicy(void* pglobalpowerpolicy);
bool windowssys_windows_win32_system_power_readProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy);
bool windowssys_windows_win32_system_power_readPwrScheme(uint32_t uiid, void* ppowerpolicy);
int64_t windowssys_windows_win32_system_power_registerPowerSettingNotification(void* hrecipient, void* powersettingguid, uint32_t flags);
int64_t windowssys_windows_win32_system_power_registerSuspendResumeNotification(void* hrecipient, uint32_t flags);
int32_t windowssys_windows_win32_system_power_requestWakeupLatency(int32_t latency);
bool windowssys_windows_win32_system_power_setActivePwrScheme(uint32_t uiid, void* pglobalpowerpolicy, void* ppowerpolicy);
bool windowssys_windows_win32_system_power_setSuspendState(bool bhibernate, bool bforce, bool bwakeupeventsdisabled);
int32_t windowssys_windows_win32_system_power_setSystemPowerState(int32_t fsuspend, int32_t fforce);
uint32_t windowssys_windows_win32_system_power_setThreadExecutionState(uint32_t esflags);
int32_t windowssys_windows_win32_system_power_unregisterPowerSettingNotification(int64_t handle);
int32_t windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(int64_t handle);
bool windowssys_windows_win32_system_power_validatePowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy);
bool windowssys_windows_win32_system_power_writeGlobalPwrPolicy(void* pglobalpowerpolicy);
bool windowssys_windows_win32_system_power_writeProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy);
bool windowssys_windows_win32_system_power_writePwrScheme(void* puiid, void* lpszschemename, void* lpszdescription, void* lpscheme);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H */

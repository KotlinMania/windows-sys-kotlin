package io.github.kotlinmania.windowssys.windows.win32.system.eventnotificationservice

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val CONNECTION_AOL: UInt = 4u

public val CONNECTION_LAN: SensConnectionType = 0u

public val CONNECTION_WAN: SensConnectionType = 1u

public val NETWORK_ALIVE_AOL: UInt = 4u

public val NETWORK_ALIVE_INTERNET: UInt = 8u

public val NETWORK_ALIVE_LAN: UInt = 1u

public val NETWORK_ALIVE_WAN: UInt = 2u

public val SENS: Guid = Guid.fromU128(U128(0xd597cafe5b9f11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_EVENTCLASS_LOGON: Guid = Guid.fromU128(U128(0xd59786305b9f11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_EVENTCLASS_LOGON2: Guid = Guid.fromU128(U128(0xd59786505b9f11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_EVENTCLASS_NETWORK: Guid = Guid.fromU128(U128(0xd59786205b9f11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_EVENTCLASS_ONNOW: Guid = Guid.fromU128(U128(0xd59786405b9f11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_PUBLISHER: Guid = Guid.fromU128(U128(0x5fee1bd65b9b11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_SUBSCRIBER_LCE: Guid = Guid.fromU128(U128(0xd3938ab05b9d11d1uL, 0x8dd200aa004abd5euL))

public val SENSGUID_SUBSCRIBER_WININET: Guid = Guid.fromU128(U128(0xd3938ab55b9d11d1uL, 0x8dd200aa004abd5euL))

![[Pasted image 20231109091146 1.png]]![[Pasted image 20231109091150 1.png]]
### EtherChannel Negotiation

An EtherChannel can be established using one of three mechanisms:

- **[PAgP](PAGp)** - Cisco's proprietary negotiation protocol
- **[LACP](LACP) (IEEE 802.3ad)** - Standards-based negotiation protocol
- **Static Persistence ("On")** - No negotiation protocol is used

 
![[Pasted image 20231109091209 1.png]]

Only a single line is needed to configure a group of ports as an EtherChannel:
S1(config)# **interface range f0/13 -15**
S1(config-if-range)# **channel-group 1 mode ?**
  active     Enable LACP unconditionally
  auto       Enable PAgP only if a PAgP device is detected
  desirable  Enable PAgP unconditionally
  on         Enable Etherchannel only
  passive    Enable LACP only if a LACP device is detected

S1(config-if-range)# **channel-group 1 mode active**
Creating a port-channel interface Port-channel 1


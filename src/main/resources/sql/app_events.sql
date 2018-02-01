
CREATE TABLE `app_events` (
  `event_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `event_type` char(20) NOT NULL,
  `event_action` char(20) NOT NULL,
  `published` tinyint(1) DEFAULT '0',
  `payload` text,
  `source_type` char(20) NOT NULL,
  `source_id` char(20) NOT NULL,
  `creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`event_id`),
  KEY `event_type_action_index` (`event_type`,`event_action`)
) ENGINE=MyISAM AUTO_INCREMENT=8025628 DEFAULT CHARSET=latin1
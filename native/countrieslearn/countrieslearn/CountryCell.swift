//
//  File.swift
//  countrieslearn
//
//  Created by Angélica Oliveira on 04/10/19.
//  Copyright © 2019 Angélica Oliveira. All rights reserved.
//

import UIKit
import SharedData

public class CountryCell: UITableViewCell {
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var capitalLabel: UILabel!
    @IBOutlet weak var regionLabel: UILabel!
    
    public func configure(country: Country) {
        nameLabel.text = country.name
        capitalLabel.text = country.capital
        regionLabel.text = country.region
    }
}
